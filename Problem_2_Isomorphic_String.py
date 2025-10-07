class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        stringCompare={}
        myset = set()
        if len(s)==1:
            return True
        for index in range(len(s)):
            if s[index] in stringCompare:
                if stringCompare[s[index]] != t[index]:
                    return False
            else:
                if t[index] in myset:
                # if t[index] in stringCompare.values():
                    return False
                else:
                    stringCompare[s[index]]=t[index]
                    myset.add(t[index])              
        return True

