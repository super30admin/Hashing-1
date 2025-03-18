'''
Map each char in s -> t and t -> s. Return False, when there is a mismatch in either of the dictionary.
When all characters are valid, loops ends and returns True.

Time Complexity: O(n)
Space Complexity: O(n)
'''

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:

        mydict1, mydict2 = {}, {}

        for i in range(len(s)):
            if s[i] in mydict1:
                if mydict1[s[i]] != t[i]:
                    return False
            else:
                mydict1[s[i]] = t[i]

            if t[i] in mydict2:
                if mydict2[t[i]] != s[i]:
                    return False
            else:
                mydict2[t[i]] = s[i]
            

        return True
        