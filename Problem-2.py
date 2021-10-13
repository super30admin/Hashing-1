# 205. Isomorphic Strings
# https://leetcode.com/problems/isomorphic-strings/

# Time Complexity: O(n)
# Space Complexity: O(1)

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        
        s_t = dict()
        t_s = dict()

        for i,j in zip(s,t):
            if i in s_t:
                if j != s_t[i]:
                    return False
            else:
                s_t[i] = j
            
            if j in t_s:
                if i != t_s[j]:
                    return False
            else:
                t_s[j] = i
        return True


obj = Solution()
print(obj.isIsomorphic('add','egg'))
print(obj.isIsomorphic('bar','foo'))
print(obj.isIsomorphic('foo','bar'))
print(obj.isIsomorphic('paper','title'))