class Solution:
    # We use prime values because their unique property ensures that no two different letter combinations produce the same product.
    # Because every number has a unique prime factorization, assigning each letter a distinct prime ensures all anagrams yield the same product, while different words produce different ones.
    # Example (using primes):
    # "abc" → 2 × 3 × 5 = 30
    # "bca" → 3 × 5 × 2 = 30 (same hash)
    # "abd" → 2 × 3 × 7 = 42 (different hash)
    # Example (without primes):
    # If we used regular numbers instead of primes, say a → 2, b → 4, c → 6, d → 3
    # "ab" → 2 × 4 = 8
    # "c" → 6 → 6
    # but "bd" → 4 × 3 = 12
    # and "ac" → 2 × 6 = 12 (collision!)
    # Here, "bd" and "ac" are not anagrams but produce the same hash (12).
    # This happens because non-prime numbers share factors (e.g., 4 = 2×2, 6 = 2×3), causing different combinations to multiply to the same value.
    # Using primes avoids this problem, since each prime’s factors are unique — guaranteeing no collisions and making the hash order-independent and reliable for grouping anagrams.    
    primeValues = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]

    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # Variable to store the result to return
        res = []
        # This hashMap will store hash and value would be a list of strings
        hashMap = {}
        for string in strs:
            hashKey = self.getHash(string)
            if hashKey in hashMap:
                hashMap[hashKey].append(string)
            else:
                hashMap[hashKey] = [string]
        for key, values in hashMap.items():
            res.append(values)
        
        return res

    
    def getHash(self, string: str) -> int:
        # To get the hash we can use product sum of prime values.
        productSum = 1
        for c in string:
            productSum *= self.primeValues[ord(c) - ord('a')]

        return productSum