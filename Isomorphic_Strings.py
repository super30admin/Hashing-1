# Created by Aashish Adhikari at 10:04 AM 12/31/2020

class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """

        # Traverse s
        dict1 = {}
        for idx in range(len(s)):

            if s[idx] in dict1:

                if dict1[s[idx]] != t[idx]:
                    return False

            else:

                dict1[s[idx]] = t[idx]

        # Traverse t
        dict1 = {}
        for idx in range(len(t)):

            if t[idx] in dict1:

                if dict1[t[idx]] != s[idx]:
                    return False

            else:

                dict1[t[idx]] = s[idx]
        return True






