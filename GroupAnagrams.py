# Time Complexity : O(n*k) where n is the number of strings and k is the length of the string
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

from typing import List


class Solution:
    def calculateHash(self, str:str) -> int:
        primes = [2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103]
        hash = 1
        for i in range(len(str)):
            sChar = str[i]
            hash = hash* (primes[ord(sChar)- ord('a')])
        return hash    
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
     anagrams = {}
     for str in strs:
    #    sorted_str = "".join(sorted(str))
       hash_value = self.calculateHash(str)
       if hash_value not in anagrams:
          anagrams[hash_value] = []
       anagrams[hash_value].append(str)
     return list(anagrams.values())
   
