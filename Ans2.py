# Time Complexity :  O(N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : Yes      
# Any problem you faced while coding this : No  

# Your code here along with comments explaining your approach: The code checks if characters in string s map uniquely to characters in t by maintaining a dictionary (char_map) where each s character (sc) maps to a t character (tc). If sc is already mapped but doesn't match tc, it returns False. If tc is already mapped to another sc (checked via char_map.values()), it also returns False. If all characters pass these checks, the strings are isomorphic, and it returns True

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        char_map = {}

        for sc, tc in zip(s, t):
            if sc in char_map:
                if char_map[sc] != tc:
                    return False
            elif tc in char_map.values():
                return False

            char_map[sc] = tc
        
        return True
