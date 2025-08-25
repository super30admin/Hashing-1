'''
Maintain a mapping of str S->T and a set to maintain unique mapping keys.
Time Complexity: O(k), k = length of Str S (== length of str t) | iterating over the str
Space Complexity: O(k), Map storing mapping of characters and a set mantaining unique mapping elements
'''

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        s2t_map = {} # mapping of characters from str S -> T
        unique_map = set() # set to hold all the unique mappings of str t
        for idx, ch in enumerate(s):
            if ch not in s2t_map:
                if t[idx] in unique_map: # if the mapping of str t has already been asigned
                    return False
                s2t_map[ch] = t[idx] # first occurence
                unique_map.add(t[idx])

            if s2t_map[ch]!=t[idx]: # check if previous mapping in consistent
                return False
        
        return True