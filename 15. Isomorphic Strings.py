15. Isomorphic Strings


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        # We are maintaining two mappings to ensure one-to-one character correspondence
        smap = {}  # Mapping characters from s to t
        tmap = {}  # Mapping characters from t to s
        
        # We are iterating through each character pair in both strings
        for i in range(len(s)):
            sChar = s[i]
            tChar = t[i]
            
            # We are checking if sChar already has a mapping
            if sChar in smap:
                # We are verifying the mapping is consistent
                if smap[sChar] != tChar:
                    return False
            else:
                # We are creating a new mapping from s to t
                smap[sChar] = tChar

            # We are checking if tChar already has a mapping
            if tChar in tmap:
                # We are verifying the reverse mapping is consistent
                if tmap[tChar] != sChar:
                    return False
            else:
                # We are creating a new reverse mapping from t to s
                tmap[tChar] = sChar
        
        # We are returning True if all character mappings are consistent
        return True

# Time Complexity (TC): O(n) - where n is the length of string s
# Space Complexity (SC): O(1) - at most 26 lowercase letters in each map (constant space)