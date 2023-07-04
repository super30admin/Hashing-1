# Time:O(n), n is len(s)
# space: O(1)
# issues faced: case when a mapping is encountered again.
# code run on leetcode successfully: yes
# Approach:
# compare both strings, element by element.
# maintain mappings of each element from s2t in a 128(ASCII) sized array, whose indices are space of inputs for s. similarly maintain t2s 
# if value already maps to another key or if a key already maps to another value, return False. else True.
# basically the mapping relation must be a one to one function.

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        s2t, t2s = [None for _ in range(128)], [None for _ in range(128)]
        print()
        for i in range(len(s)):
            idx1, idx2 = ord(s[i])-ord(" "), ord(t[i])-ord(" ")
            if not s2t[idx1] and not t2s[idx2]:
                s2t[idx1], t2s[idx2] = t[i], s[i]
            elif not s2t[idx1] and t2s[idx2]:
                return False  # the value is already mapped before      
            elif s2t[idx1] != t[i]:
                return False # the key already has a different value
        return True
