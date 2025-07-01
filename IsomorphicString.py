# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes

class Solution(object):
    def isIsomorphic(self, s, t):
        if len(s) != len(t):
            return False
        s_t_map = {}
        for i in range(len(s)):
            s_char = ("s_"+s[i])
            t_char = ("t_"+t[i])
            if s_char in s_t_map:
                if t_char in s_t_map:
                    if s[i] != s_t_map.get(t_char) and t[i] != s_t_map.get(s_char):
                        return False
                else:
                    return False
            elif t_char in s_t_map:
                return False
            s_t_map[s_char] = t[i]
            s_t_map[t_char] = s[i]
        return True

#obj = Solution()
#sol1 = obj.isIsomorphic("egg", "add")
#print(sol1)
#sol2 = obj.isIsomorphic("foo", "bar")
#print(sol2)
#sol3 = obj.isIsomorphic("paper", "title")
#print(sol3)
#sol4 = obj.isIsomorphic("bbbaaaba", "aaabbbba")
#print(sol4)