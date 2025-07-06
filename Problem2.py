# TC : O(n)
# SC : O(n)

class Solution(object):
    def isIsomorphic(self, s, t):
        
        smap={}
        tmap={}
        s=list(s)
        t=list(t)
        # print (s,t)
        for i in range(len(s)):
            sChar =s[i]
            tChar=t[i]
            if sChar in smap:
                if smap[sChar] != tChar:
                    return False
            else:
                smap[sChar]=tChar
            if tChar in tmap:
                if tmap[tChar] != sChar:
                    return False
            else:
                tmap[tChar]=sChar
            
        return True
