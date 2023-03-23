
#To find they are isomorphic we are taking two hashmaps and storing it them in the in hashmaps as key value pairs
#when new key comes in it checks with smap and tmap if they are present or not . if they are present they return false.

#tc: O(n)
#SC: O(1)
class Solution:

    def isIsomorphic(self, s: str, t: str) -> bool:

        if len(s) != len(t):
            return False

        smap = {}
        tmap = {}

        for i in range(len(s)):
            schar = s[i]
            tchar = t[i]

            if smap.get(schar) == None:
                smap[schar] = tchar
            else:
                if smap[schar] != tchar:
                    return False

            if tmap.get(schar) != None:
                if tmap[tchar] != schar:
                    return False
            else:
                tmap[tchar] = schar

        return True
