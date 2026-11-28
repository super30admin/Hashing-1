class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        #idea is to maintain two hashmaps and map each character of s to each character of t
        smap={}
        tmap={}
        for i in range(len(s)):
            schar=s[i]
            tchar=t[i]
            if schar in smap:
                if smap[schar]!=tchar:
                    return False
            else:
                smap[schar]=tchar
            if tchar in tmap:
                if tmap[tchar]!=schar:
                    return False
            else:
                tmap[tchar]=schar
        return True
        