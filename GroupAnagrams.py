class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        # Used for hashing.
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]

        # Let's group all the anagrams together, using a map as it can easily
        # give us a way to collect all the anagrams together.
        d= dict()

        # for each word, here is how we calculate the hash.
        # multiply each characte corresponding prime
        # number to the result.
        def getHash(word):
            res = 1
            for w in word:
                res = res * primes[ord(w) - 97]
            return res

        # Now just loop over all the words, and start adding them to the same buckets.
        for word in strs:
            hash = getHash(word)

            if hash not in d:
                # New key, just add an empty list.
                d[hash] = []
            d[hash].append(word)
        return d.values()