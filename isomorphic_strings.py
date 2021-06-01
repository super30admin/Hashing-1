class Solution:
    '''
    Time complexity: O(n)
    Space complexity: O(n)
    '''
    def isIsomorphic(self, s: str, t: str) -> bool:
        # make a dict with the count
        d = {}

        for i in range (len(s)):
            if s[i] in d.keys():
                if d[s[i]] != t[i]:
                    return False

            else:
                if t[i] in d.values():
                    return False
                d[s[i]] = t[i]
        return True