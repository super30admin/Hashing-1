# Time Complexity :  O(N*K)
# Space Complexity : O(N*K)
# Did this code successfully run on Leetcode : Yes      
# Any problem you faced while coding this : No  

# Your code here along with comments explaining your approach: Group Anagrams using HashMap where key to a group would be prime product of characters in a string. Each Character in a string is mapped to a prime number. Strings with same prime product are grouped together.


from collections import defaultdict
from typing import List 

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if not strs:
            return []
        
        prime_map = defaultdict(list)

        for s in strs:
            prime_product = self.calculate_prime_product(s)
            prime_map[prime_product].append(s)
        
        return list(prime_map.values())
        
    def calculate_prime_product(self, s: str) -> int:
        primes = [2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103]
        multi = 1
        for char in s:
            multi *= primes[ord(char) - ord('a')]
        return multi
