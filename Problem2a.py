class Solution:
    '''
    Time complexity: O(n)
    Space complexity: O(1)
    '''

    def isIsomorphic(self, s: str, t: str) -> bool:
        if s is None and t is None:  # check if both strings are None, isomorphic True
            return True
        if s is None or t is None:  # check if either string is None, isomorphic False
            return False
        if len(s) != len(t):  # If the lengths of the strings are different, isomorphic False
            return False

        # Creating maps to store the mapping from characters in string s to string t and vice versa
        sMap = {}
        tMap = {}

        for i in range(len(s)):
            # Get the character from string s and t at index i
            sChar = s[i]
            tChar = t[i]

            if s[i] not in sMap:
                # If the current character in s is not in the sMap,
                # add the mapping from sChar to tChar in sMap
                sMap[s[i]] = t[i]
            else:
                # If the current character in s is already in sMap,
                # check if the mapping is consistent
                if sMap[s[i]] != t[i]:
                    return False

            if t[i] not in tMap:
                # If the current character in t is not in the tMap,
                # add the mapping from tChar to sChar in tMap
                tMap[t[i]] = s[i]
            else:
                # If the current character in t is already in tMap,
                # check if the mapping is consistent
                if tMap[t[i]] != s[i]:
                    return False

        return True  # If all characters are mapped consistently, isomorphic strings
