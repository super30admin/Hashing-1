class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        #use the same approach of using two hashmaps
        new_s=s.split()
        pmap={}
        smap={}
        if len(pattern)!=len(new_s):
            return False
        for i in range(len(pattern)):
            p=pattern[i]
            ns=new_s[i]
            if p in pmap:
                if pmap[p]!=ns:
                    return False
            else:
                pmap[p]=ns

            if ns in smap:
                if smap[ns]!=p:
                    return False
            else:
                smap[ns]=p
        return True 
        