class IsomorphicStrings(object):
    '''
    Solution:
    1. Map each character in first string to each character in second string in the same order and vice versa using
        another hashMap.
    2. While updating each HashMap, if a false mapping exists in any hashMap at any point of iteration, return False.
    3. If everything goes correctly, return True

    --- Passed all Leetcode testcases successfully
    '''
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """

        # O(n) Time Complexity | O(1) Space Complexity
        if len(s) != len(t):
            return False
        mapS = {}
        mapT = {}

        for i in range(len(s)):

            if s[i] not in mapS:
                mapS[s[i]] = t[i]
            else:
                if mapS[s[i]] != t[i]:
                    return False

            if t[i] not in mapT:
                mapT[t[i]] = s[i]
            else:
                if mapT[t[i]] != s[i]:
                    return False

        return True