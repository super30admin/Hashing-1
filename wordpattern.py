class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        d = {}
        words=s.split()
        se = set()
        
        if len(pattern)!=len(words):
            return False
        
        for i in range(0,len(pattern)):
            if pattern[i] not in d:
                if words[i] not in se:
                       d[pattern[i]] = words[i]
                       se.add(words[i])
                       
                else:
                       return False          
            else:
                if d[pattern[i]]!=words[i]:
                       return False
                       
        return True
                       
            
            
        