"""Using the prime products as the hashkey. prime products ensures no collisions and 
efficient compared to sorting the word. Words with same hash key are grouped together
in a default dict. Here using a data structure like dictionary will make the retrieval
process constant time. 
TC: O(n*k), SC: O(n*k)"""

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        result = collections.defaultdict(list)
        def prime_product(word):
            primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113]

            product = 1
            for char in word:
                prime = primes[ord(char)-ord('a')]
                product *= prime
            return product

        for word in strs:
            hash_key = prime_product(word) 
            result[hash_key].append(word)
        return result.values()