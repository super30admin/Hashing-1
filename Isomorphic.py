# Time Complexity: O(N), N is the length of the string
# Space Complexity: O(N), N is the length of the string
# Did this code successfully run on Leetcode: Yes


class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if len(s) != len(t):
            return False
        
        s_map = {}
        t_set = set()

        for index in range(len(s)):
            if s[index] in s_map:
                if s_map[s[index]] != t[index]:
                    return False
            else:
                if t[index] in t_set:
                    return False
                t_set.add(t[index])
                s_map[s[index]] = t[index]
         
        
        
        return True