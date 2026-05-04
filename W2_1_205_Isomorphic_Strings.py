# Time Complexity: O(n), where n is the length of the strings
# Space Complexity: O(1), since the input is limited to a fixed ASCII character set

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        s_to_t_map = {}

        # Use to search in O(1)
        used_chars = set()

        for char_s, char_t in zip(s, t):

            # Check constraints before building hashmap
            if char_s not in s_to_t_map:    
                if char_t in used_chars:
                    return False

                # Build the hashmap    
                else:
                    used_chars.add(char_t)
                    s_to_t_map[char_s] = char_t

                # Execute when current character is already in the map
            else:
                if s_to_t_map[char_s] != char_t:
                    return False

        return True
