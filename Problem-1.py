# Time Complexity : O(n*k)
# Space Complexity :O(nk)
# Did this code successfully run on Leetcode :yes
# Any problem you faced while coding this :None

# Your code here along with comments explaining your approach in three sentences only
#there are 3 approaches for this, one is through greedy iterating through each
#2nd is through cal frequency, 3rd is prime product
#i calculated the prime array of length 26 and then cal product. created dictionary product as key and list of list as values.

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if len(strs)==0:
            return
        output = {}
        for i in range(len(strs)):
            calProd = self.prod(strs[i])
            if calProd in output.keys():
                output[calProd].append(strs[i])
            else:
                output[calProd] = [strs[i]]
        return list(output.values())
    def prod(self,str):
        prime_array = [2,  3,  5,  7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        result = 1
        for i in str:
            result *= prime_array[ord(i)-ord("a")]
        return result