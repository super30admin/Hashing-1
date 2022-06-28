#Time Complexity: O(n) 
#Sapce Complexity: O(n)
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s)!=len(t):
            return False
        s_to_t = {}
        t_mapped=set()
        
        for cs, ct in zip(s,t):
            if cs in s_to_t:
                if s_to_t[cs]!=ct:
                    return False
                elif ct in t_mapped:
                    return False
                s_to_t[cs]=ct
                t_mapped.add(ct)
                
        return True