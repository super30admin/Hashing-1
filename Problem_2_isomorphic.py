# // Time Complexity : O(n)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        dictMap = collections.defaultdict(dict)
        
        for i in range(len(s)):
            #char not present in dictionary
            if s[i] not in dictMap:
                #check if value is present with another key
                if t[i] not in dictMap.values():
                    dictMap[s[i]] = t[i]
                else:
                    return False
            #char present in dictionary
            else:
                val = dictMap[s[i]]
                #if the value matches with t[i] then continue
                if val == t[i]:
                    continue
                else:
                    return False
        return True
        