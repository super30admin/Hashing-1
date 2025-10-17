class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        # Dictionary to store the mapping from characters in s → characters in t
        sToTMapping = {}
        
        # Set to track which characters in t have already been mapped
        # (so that no two different chars from s map to the same char in t)
        tMapped = set()
        
        # Iterate through all characters in both strings at the same time
        for i in range(len(s)):
            s_char = s[i]
            t_char = t[i]
            
            # If we've seen this s_char before
            if s_char in sToTMapping:
                # Check if it maps to the same character as before
                # If not, mapping is inconsistent → not isomorphic
                if sToTMapping[s_char] != t_char:
                    return False
            
            # If this s_char is not yet mapped
            else:
                # Before creating a new mapping, check if t_char is already used
                # If yes, that means some other s_char already maps to this t_char
                # (violates the "no two chars map to the same char" rule)
                if t_char in tMapped:
                    return False
                
                # Otherwise, record this new mapping and mark t_char as used
                sToTMapping[s_char] = t_char
                tMapped.add(t_char)
        
        # If we reached here, all mappings were consistent → strings are isomorphic
        return True