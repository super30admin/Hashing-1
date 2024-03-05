# Time and space complexity is O(N)
class Isomorphic:
    def isIsomorphic(self, s, t):
        sT = {}
        tT = {}
        
        if len(s) != len(t):
            return False
        
        for i in range(len(s)):
            sc = s[i]
            tc = t[i]
            if(sc in sT and sT[sc] != tc) or (tc in tT and tT[tc] != sc):
                return False
            
            sT[sc] = tc
            tT[tc] = sc
            
        return True
    