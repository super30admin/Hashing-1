class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if not s or not t:
            return False

        d= dict() #used for character mapping
        vis = set() #used to track wheteher a character has been mapped or not.

        for i in range(len(s)):
            #Case where we are mapping the characters for the first time.
            if s[i] not in d and t[i] not in vis:
                vis.add(t[i])
                d[s[i]] = t[i]
            elif s[i] in d:
                # Character has been mapped. Make sure that the value is same.
                if d[s[i]] != t[i]:
                    return False
            else:
                #Value has been mapped to another character.
                return False
        return True

    #Time Complexity : O(n)
    #Space Complexity : O(n)