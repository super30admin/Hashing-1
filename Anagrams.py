# Time Complexity : O(N) //As it would run N number of time the words present
#  Space Complexity : O(N) //Number of letters defined here we habe O(26) space
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this : N/A

#  Your code here along with comments explaining your approach

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        dictAnagram = {}
        
        #Seprating words
        for anaStr in strs:
            key = [0] * 26 
            
            #Seprating letters from word and storing there value calculated from ascii
            for char in anaStr:
                val = (ord(char) - ord("a"))
                key[val] += 1
            
            #Converting list to tule to make it hashable
            key = tuple(key)
            
            if key in dictAnagram:
                dictAnagram[key].append(anaStr)
            else:
                dictAnagram[key] = [anaStr]
        
        res = []
        #Adding the groups of anagram to the res
        for anagrams in dictAnagram.values():
            res.append(anagrams)
        return res