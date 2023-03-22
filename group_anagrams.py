# Time Complexity : O(nk) where n is the number of strings and k is the length of the string
# Space Complexity : O(n) as we are using a hashmap
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach in three sentences only
"""In this code we are using the concept of prime numbers. We are using the prime numbers to find the unique product of the characters in the string.
These unique products are then used as keys in the hashmap. The values are the list of strings that have the same unique product."""

import collections

class Solution:
    primes = None
    def getprimes(self, n):
        prime_list = []
        is_prime = [True] * (n**2 + 1)
        for i in range(2, n**2 + 1):
            if is_prime[i]:
                prime_list.append(i)
                for j in range(i * i, n**2 + 1, i):
                    is_prime[j] = False
        return prime_list[:n]

    # Because multiplication of prime numbers is unique to just that combination
    def getPrimeProduct(self, s:str, primes) -> int:

        primeProduct=1

        for character in s:
            primeProduct = primeProduct * primes[ord(character) - ord('a')]

        return primeProduct

    
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if strs == None or len(strs) == 0:
            return[]
        
        hashmap = collections.defaultdict(list)
        primes = self.getprimes(26)
        for string in strs:
            primeProduct = self.getPrimeProduct(string, primes)
            hashmap[primeProduct].append(string)

        return hashmap.values()