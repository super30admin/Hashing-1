# Created by Aashish Adhikari at 10:36 PM 1/2/2021

'''
Time Complexity:
O(n) where n is the lenth of each of the strings.

Space Complexity:
O(n) assuming each character can be different and the vocabulary is not limited to english alphabets.
'''

class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """

        if len(s) != len(t):
            return False

        hm = {}
        hs = set()

        for idx in range(len(s)):


            # For hashmap
            if s[idx] in hm:
                if hm[s[idx]] != t[idx]:
                    return False

                if t[idx] not in hs:
                    return False

            else:
                if t[idx] in hs:
                    return False

                else:
                    hm[s[idx]] = t[idx]
                    hs.add(t[idx])




        return True
