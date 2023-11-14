# Return if length doesn't match
# Create 2 hashmaps to check one char map of one string with another
# Check if char already exist and match with char from t; return false if it doesn't match else add if the char s doesn't exist in the hashmap
# do the same for mapping from string t to s

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        if len(s) != len(t):
            return False

        charMap_st,charMap_ts = {},{}

        for char_s, char_t in zip(s, t):
            
            # Check mapping from string s to t
            if char_s in charMap_st:
                if charMap_st[char_s] != char_t:
                    return False
            else:
                charMap_st[char_s] = char_t

            # Check mapping from string t to s
            if char_t in charMap_ts:
                if charMap_ts[char_t] != char_s:
                    return False
            else:
                charMap_ts[char_t] = char_s

        return True

# ------------------------------------------------------------------------------------------------------------------------------
# Time complexity: O(N) where N is the length of s/t