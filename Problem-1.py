#Time Complexity : O(N * K) 
#Space Complexity : O(N * K) 
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
         d = {}
         for s in strs:
             prime_prod = self.primeProduct(s)
             if prime_prod in d:
                d[prime_prod].append(s)
             else:
                 d[prime_prod] = [s]
         return list(d.values())

    def primeProduct(self, s:str) -> int:
            prime = [2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103]
            result = 1
            for i in range(len(s)):
                result *= (prime[ord(s[i]) - ord('a')])
            return result
                 
