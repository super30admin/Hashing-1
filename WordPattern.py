class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        
        s = s.split(" ")
        print(s)
        hashmap = {}
        
        if len(s) != len(pattern):
            return False
        else:
            
            for a in range(len(s)):
                if pattern[a] not in hashmap:
                    if s[a] in list(hashmap.values()):
                        return False
                    hashmap[pattern[a]] = s[a]
                elif (hashmap[pattern[a]] != s[a]):
                    return FalsE
            
            return True
        
                    
                
                
        