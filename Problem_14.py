# Time Complexity: O(n)
# Space Complexity: O(n) + O(n) ~ O(n)

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        dict1 = {}
        dict2 = {}
        for i in range(len(s)):
            if s[i] not in dict1:
                if t[i] in dict2:
                    return False
                else:
                    dict1[s[i]] = t[i]
                    dict2[t[i]] = 1
            elif t[i] != dict1[s[i]]:
                return False
        
        return True