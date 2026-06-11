# LEETCODE PROBLEM 205. ISOMORPHIC STRINGS
# TIME COMPLEXITY: O(N) where N denotes the length of the string s (given that we have a constrain
# saying the lenght of s and t are equal)
# SPACE COMPLEXITY: O (1)
# Any problem you faced while coding this: None


class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        s_hashmap={}
        t_hashmap={}
        for i in range(len(s)):
            s_char=s[i]
            t_char=t[i]
            if s_char not in s_hashmap:
                s_hashmap[s_char]=t_char
            else:
                if s_hashmap[s_char]!=t_char:
                    return False
            if t_char not in t_hashmap:
                t_hashmap[t_char]=s_char
            else:
                if t_hashmap[t_char]!=s_char:
                    return False
        return True
