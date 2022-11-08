class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        
        d = {}
        l = []
        
        s = s.split()
        
        if len(s) != len(pattern):
            return False
        
        for i in range(len(pattern)):
            if pattern[i] not in d and s[i] not in l:
                d[pattern[i]] = s[i]
                l.append(s[i])
            elif pattern[i] not in d and s[i] in l:
                return False
            else:
                if d[pattern[i]] != s[i]:
                    return False
                
        return True
