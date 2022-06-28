# Time Complexity = O(n)
# Space Complexity = O(1)

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        # 2 hashmaps solutions. Using dictionaries in python
        
        if (len(s) != len(t)):
            return False
        
        sdict = {}
        tdict = {}
        
        for i in range(0, len(s)):
            # Iteration of characters
            sChar = s[i]
            tChar = t[i]
            # Character already present in s Dictionary
            if sChar in sdict:
                # Check if sChar is mapped to the same tChar
                if sdict.get(sChar) != tChar:
                    return False
            # Add new character to dictionary
            else:
                sdict.update({sChar: tChar})
            
            # Character already present in t Dictionary
            if tChar in tdict:
                # Check if tChar is mapped to the same sChar
                if tdict.get(tChar) != sChar:
                    return False
            # Add new character to dictionary
            else:
                tdict.update({tChar: sChar})
        
        return True