# Time Complexityn= O(n)
# Space Complexity = O(1)


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        
        # 2 hashmaps solutions. Using dictionaries in python
        
        # Storing the corresponding strings in a list, separated by " "
        strList = s.split(" ")
        
        if (len(pattern) != len(strList)):
            return False
        
        patternDict = {}
        sDict = {}
        
        # Iteration of characters
        for i in range(0, len(pattern)):
            pChar = pattern[i]
            sStr = strList[i]
            # Character already present in pattern Dictionary
            if pChar in patternDict:
                # Check if pChar is mapped to the same string
                if patternDict.get(pChar) != sStr:
                    return False
            # Add new character to dictionary
            else:
                patternDict.update({pChar: sStr})
            
            # Character already present in s Dictionary
            if sStr in sDict:
                # Check if string is mapped to the same pChar
                if sDict.get(sStr) != pChar:
                    return False
            # Add new character to dictionary
            else:
                sDict.update({sStr: pChar})
        
        return True
        
