#Group Anagrams

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # Using prime number hashing to identify anagrams
        def getPrimes(str):
            # Computing hash by multiplying prime numbers assigned to each character
            hash = 1
            primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
            for s in str:
                # Multiplying hash with prime corresponding to each character
                hash *= primes[ord(s) - ord('a')]
            return hash

        # Storing strings grouped by their hash values
        result = defaultdict(list)
        for s in strs:
            # Computing hash for each string and grouping anagrams together
            hashValue = getPrimes(s)
            result[hashValue].append(s)
        # Returning all grouped anagrams
        return list(result.values())

# TC: O(n * k) where n is number of strings and k is average length of string
# SC: O(n * k) for storing all strings in the result dictionary