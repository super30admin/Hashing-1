""" Explanation: I used two hashmaps, one to map the characters from string s to t, and another one to map characters from t to s
    Then, I simply check if the letter from s to t has been mapped already, if it's then don't map it, otherwise map it. After the mapping,
    we just check if the mapping is one-to-one for s to t and t to s.
    Time Complexcity: O(n) where n is the length of the string
    Space Complexcity: O(1)
"""


class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        s_dict, t_dict = {}, {}
        for i in range(len(s)):
            if s[i] in s_dict and s_dict[s[i]] != t[i]:
                return False
            if t[i] in t_dict and t_dict[t[i]] != s[i]:
                return False
            s_dict[s[i]] = t[i]
            t_dict[t[i]] = s[i]
        return True

        