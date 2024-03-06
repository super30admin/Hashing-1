#Time Complexity: O(n)
#Space Complexity: O(n)

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s = s.split(" ")
        if len(pattern)!=len(s):
            return False
        dict1, dict2 = {}, {}
        for i in range(len(pattern)):
            if pattern[i] in dict1 and dict1[pattern[i]]!=s[i]:
                return False
            if s[i] in dict2 and dict2[s[i]]!=pattern[i]:
                return False
            dict1[pattern[i]]=s[i]
            dict2[s[i]]=pattern[i]

                
        return True

        