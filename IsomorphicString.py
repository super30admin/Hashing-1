class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        mapST,mapTS={},{}

        for i in range(len(s)):
            c1,c2=s[i],t[i]

            if((c1 in mapST and mapST[c1]!=c2) or (c2 in mapTS and mapTS[c2]!=c1)):
                return False
            '''
            This statement will return False if one of the following cases are true:
            If the character from s string is already mapped to another character in the t string.
            OR
            If the character from t string is already mapped to another character in the s string
            '''
            mapST[c1]=c2 
            mapTS[c2]=c1
        return True