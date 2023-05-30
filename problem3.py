#Time Complexity : O(n)
#Space Complexity : O(n)
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No


#Used hashMap to store the apping for pattern and string. Added checks to find if there is a mismatch with existing mapping.

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        patternCheck = {}
        s = s.split(" ")
        if len(pattern)!= len(s):
            return False
        for p,ch in zip(pattern,s):
            print(p,ch)
            if ch in patternCheck.keys():
                if p!= patternCheck[ch]:
                    return False
            else:
                if p in patternCheck.values():
                    return False
            # print(patternCheck)
            patternCheck[ch] = p
        return True
        