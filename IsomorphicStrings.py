#All test cases passed on leetocde 

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:

        # Here we iterate through characters of s and t and store their mapping in dictionary. 
        # If current char in s is present in t or vice versa then it should match with its 
        # exitsting matches present in s dictionary or t dictionary. If it doesnt match then we return False
        # Time complexity - O(n) where n is length of s or t string
        # Space complexity - O(1) because in dictionary we store characters of s and t which can be max 256 characters
        if len(s)!=len(t):
            return False

        sdict = {}
        tdict = {}

        for i in range(len(s)):
            if s[i] in sdict:
                if sdict[s[i]]!=t[i]:
                    return False
            elif t[i] in tdict:
                if tdict[t[i]]!=s[i]:
                    return False
            else:
                sdict[s[i]] = t[i]
                tdict[t[i]] = s[i]

        return True


        #------------------------OR-------------------------


        # Time complexity - O(n) where n is length of s or t string
        # Space complexity - O(1) because in array we store characters of s and t which can be max 256 characters
        if len(s)!=len(t):
            return False

        # here 256 since any ascii character possible
        smap = [0]*256
        tmap = [0]*256

        for i in range(len(s)):
            schar = s[i]
            tchar = t[i]

            if smap[ord(schar)-ord(' ')]!=0:
                if smap[ord(schar)-ord(' ')] != tchar:
                    return False
            elif tmap[ord(tchar)-ord(' ')]!=0:
                if tmap[ord(tchar)-ord(' ')] != schar:
                    return False
            else:
                smap[ord(schar)-ord(' ')] = tchar
                tmap[ord(tchar)-ord(' ')] = schar

        return True

            
        