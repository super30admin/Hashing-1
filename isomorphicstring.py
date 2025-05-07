class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        #first check if the length of the strings are same, if not return false
        if len(s)!=len(t):
            return False
        #creating two dictinaroies
        hashmap1={}
        hashmap2={}
        #iterating every char in the string s
        for i in range(len(s)):
            #checking if the char is already in the dictionary
            if s[i] in hashmap1.keys():
            #if yes, checking if its value is equivalent to the same index of the other sting t
                if (hashmap1.get(s[i])!=t[i]):
                    return False
            else:
                #if the character is not present in the dictionary, insert it
                hashmap1[s[i]]=t[i]
                
            #########################    
            
         #iterating every char in the string t        
        for i in range(len(t)):
            #checking if the char is already in the dictionary
            if t[i] in hashmap2.keys():
            #if yes, checking if its value is equivalent to the same index of the other sting s
                
                if (hashmap2.get(t[i])!=s[i]):
                    return False
            else:
                hashmap2[t[i]]=s[i]
        return True
            