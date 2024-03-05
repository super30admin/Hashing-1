# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        if(pattern is None and s is None): return True
        if(pattern is None or s is None): 
            return False
        else:
            len_s = len(s.split(" "))
            if(len(pattern) != len_s): return False

        s = s.split(" ") 
        sMap = {}
        tMap = {}

        for i in range(len(pattern)):
            tChar = pattern[i]
            sChar = s[i]
            if(sChar not in sMap):
                sMap[sChar] = tChar
            elif(sMap[sChar] != tChar):
                return False
                
            if(tChar not in tMap):
                tMap[tChar] = sChar
            elif(tMap[tChar] != sChar):
                return False
        return True

sc = Solution()
pattern = "abba"
s = "dog cat cat dog"
print(sc.wordPattern(pattern, s))