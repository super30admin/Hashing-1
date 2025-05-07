# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        outDict = {}
        for i in strs:
            uniqueValue = self.calculateUniqueValue(i)
            if outDict.get(uniqueValue) is not None:
                outDict[uniqueValue].append(i)
            else:
                outDict[uniqueValue] = [i]
                
        return outDict.values()
        
    def calculateUniqueValue(self,word:str) -> int:
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61,67, 71, 73, 79, 83, 89, 97, 101]
        product = 1
        for i in word:
            index = ord(i)-ord("a")
            product = product * primes[index]
        return product