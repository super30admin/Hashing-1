#Time Complexity: O(n)
#Space Complexity: O(n)
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        res = dict()

        for i in range(len(s)):
            s_char = 's' + s[i]
            t_char = 't' + t[i]
            if s_char not in res:
                res[s_char] = t[i]
            else:
                if res[s_char] != t[i]:
                    return False

            if t_char not in res:
                res[t_char] = s[i]
            else:
                if res[t_char] != s[i]:
                    return False
        return True

