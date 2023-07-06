# Time Complexity : O(n+m) n represents the length of string and m represents the length of pattern
# Space Complexity : O(1) as there can be 26 keys
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        patterList=list(pattern)
        stringList=s.split()
        map={}
        if len(patterList)!=len(stringList):
            return False
        for i in range(len(patterList)):
            pat=patterList[i]
            string=stringList[i]
            if pat not in map.keys():
                if string in map.values():
                    return False
                map[pat]=string
            else:
                if map.get(pat)!=string:
                    return False
        return True 


