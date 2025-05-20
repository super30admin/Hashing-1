# Every word in the string will be hash mapped with every character in the pattern. If the pattern failes to match the word in the string or vice-versa then return False else return True.


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        
        s = s.split()
        l1 = len(pattern)
        l2 = len(s)

        if l1 != l2:
            return False
        
        hashT = {}
        valueSet = set()

        for i in range(l1):
            if pattern[i] in hashT:
                if hashT[pattern[i]] !=s[i]:
                    return False
            else: 
                if s[i] in valueSet:
                    return False
                hashT[pattern[i]] = s[i]
                valueSet.add(s[i])

        return True
        
        