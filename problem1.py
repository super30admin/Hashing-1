"""
Each word is mapped to a unique product due to use of prime numbers assignment to each induvidual character, this ensures
that all anagrams are mapped to a single hash thats a product of their numbers
TC for this is O(n * k) since there are n strings and fetching hash for it is k (avg len of strings) the SC is also O(n*k)same reason
"""

class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        res = defaultdict(list)

        for string in strs: #for each string in strs, map it to the hash function value it returns
            hashF = self.getHash(string)
            res[hashF].append(string)
        return list(res.values())

    def getHash(self, word): #this is the helper hash function that gives individual values to each aplhbet
        hashF = 1
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43,
                47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]

        for c in word:
            hashF *= primes[ord(c) - ord('a')] #each word (string) has its own unqiue product and thus anagrams match to those
        return hashF
        

    

        