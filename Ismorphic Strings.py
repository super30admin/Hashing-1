#TC: O(n) , n is length of string 
#SC: O(1), since 26 max chars
# did it run on LC: yes
#problems faced: NA
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        hmap = {}
        hset = []
        
        if s is None or t is None:
            return False
        
        if s is None and t is None:
            return True
        
        if len(s) != len(t):
            return False
        
        for i in range(len(s)):
            if s[i] not in hmap:
                if t[i] not in hset:
                    hmap[s[i]] = t[i]
                    hset.append(t[i])
                else:
                    return False
                
            elif hmap[s[i]] != t[i]:
                return False
            
                
        return True

    