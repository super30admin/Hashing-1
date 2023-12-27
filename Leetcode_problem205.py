# problem: Isomorphic Strings
# time complexity: O(N) where N is the length of the string.
# space complexity: O(1) the total information content stored in ans.
# approach: we create two dictionaries and map the characters of the two strings to each other. if the character is already mapped to another character, we return False. if not, we map the characters to each other.

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        sMap = {}
        tMap = {}
        if len(s) != len(t):
            return False
        for x in range(len(s)):
            char_s = s[x]
            char_t = t[x]

            if (char_s in sMap and sMap[char_s] != char_t) or (char_t in tMap and tMap[char_t] != char_s):
                return False
            
            sMap[char_s] = char_t
            tMap[char_t] = char_s
            
        return True