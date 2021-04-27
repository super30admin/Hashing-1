class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        if len(s) != len(t):
            return False
        
        hash_S_To_T = {}
        hash_T_To_S = {}
        for index in range(len(s)):
            charOne = s[index]
            charTwo = t[index]
            
            if charOne not in hash_S_To_T:
                hash_S_To_T[charOne] = charTwo

            if hash_S_To_T[charOne] != charTwo:
                return False
            
            if charTwo not in hash_T_To_S:
                hash_T_To_S[charTwo] = charOne

            if hash_T_To_S[charTwo] != charOne:
                return False
            
        return True


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        if len(s) != len(t):
            return False
        
        hash_S_To_T = [None] * 100
        hash_T_To_S = [None] * 100
        for index in range(len(s)):
            charOne = s[index]
            charTwo = t[index]
                
            if hash_S_To_T[ord(charOne) - ord(' ')] == None:
                hash_S_To_T[ord(charOne) - ord(' ')] = charTwo

            if hash_S_To_T[ord(charOne) - ord(' ')] != charTwo:
                return False
            
            if hash_T_To_S[ord(charTwo) - ord(' ')] == None:
                hash_T_To_S[ord(charTwo) - ord(' ')] = charOne

            if hash_T_To_S[ord(charTwo) - ord(' ')] != charOne:
                return False
            
        return True