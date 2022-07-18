#Time complexity : O(n) i.e. the length if the string
#Space complexity : O(1) i.e. alphabets are constant
class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        
        """checking the length of the two strings and if the length is not equal the strings are not isomorphic"""
        if(len(s) != len(t)):
            return False
        #Creating two hashmap
        sHashmap = dict()
        tHashmap = dict()
        print(len(s))
        #iterating the loop for checking both the strings
        for i in range(0, len(s)):
            #fetching each character from the string 
            print(i)
            scharacter = s[i]
            tcharacter = t[i]
            
            #Checking the mapping in sHashmap 
            if scharacter in sHashmap:
                if sHashmap.get(scharacter)!= tcharacter:
                    return False
            #put the element in the hashmap if it is not there in it
            else:
                 sHashmap[scharacter]=tcharacter
            
            #Checking the mapping in tHashmap 
            if tcharacter in tHashmap: 
                if tHashmap.get(tcharacter)!= scharacter:
                    return False
            #put the element in the hashmap if it is not there in it
            else:
                 tHashmap[tcharacter]=scharacter
            
        return True

