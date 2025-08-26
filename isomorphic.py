def isIsomorphic(self, s: str, t: str) -> bool: # Time complexity : O(n) space complexity : O(1)
        smap={}
        tmap={}

        for i in range(len(s)):
            schar=s[i]
            tchar=t[i]

            if schar in smap:
                print(schar)
                print(tchar)
                if smap[schar] != tchar:
                    return False
            else:
                smap[schar]=tchar
            
            if tchar in tmap:
                if tmap[tchar]!=schar:
                    return False
            else:
                tmap[tchar]=schar
        return Trues