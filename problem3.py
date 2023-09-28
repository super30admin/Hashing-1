# Time Complexity: O(n) + O(k) ~ O(max(n,k)), where n -> no. of words in pattern and k -> no. of words in s
# Space Complexity: O(n) + O(n) ~ O(n)

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        dict1 = {}
        dict2 = {}
        s = s.split()
        if len(s) != len(pattern):
            return False
        for i in range(len(s)):
            if s[i] not in dict1:
                if pattern[i] in dict2:
                    return False
                else:
                    dict1[s[i]] = pattern[i]
                    dict2[pattern[i]] = 1
            elif pattern[i] != dict1[s[i]]:
                return False
        
        return True