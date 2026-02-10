# Time Complexity : O(n * k) ignoring method to get prime numbers as it is a helper function with TC : sqrt(n)
# Space Complexity : O(n * k) where n is number of strings and k is max length of string
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Approach : Hash each string as a product of prime numbers corresponding to each character.

class Solution:
    def first_26_primes(self):
        primes = []
        num = 2
        while len(primes) < 26:
            is_prime = True
            for i in range(2, int(num ** 0.5) + 1):
                if num % i == 0:
                    is_prime = False
                    break
            if is_prime:
                primes.append(num)
            num += 1
        return primes

    def getHash(self, key: str) -> float:
        primes = self.first_26_primes()

        hash = 1.0

        for ch in key:
            hash *= primes[ord(ch) - ord('a')]

        return hash

    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        groupedStrs = defaultdict(list)

        for s in strs:
            key = self.getHash(s)
            groupedStrs[key].append(s)

        return list(groupedStrs.values())

        