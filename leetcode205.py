#Time Complexity: O(n)
#Space Complexity: O(n)
#Did you complete this code successfully? Yes

class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        # approach 1: return len(set(s))==len(set(zip(s,t)))==len(set(t))
        if len(s) != len(t):
            return False

        s_to_t = {}
        t_to_s = set()

        for i in range(len(s)):
            sChar = s[i]
            tChar = t[i]
            if sChar in s_to_t:
                if s_to_t[sChar] != tChar:
                    return False
            else:
                if tChar in t_to_s:
                    return False
                s_to_t[sChar] = tChar
                t_to_s.add(tChar)

        return True