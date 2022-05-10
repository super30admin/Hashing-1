#method-1
#using two hash maps
#iterate through both the strings and map each element from first string to each element in second string into two hashmaps, in any case if you encounter a same letter again mapping to a different letter return false.


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        '''O(n) Time complexity
            O(1) space complexity'''
        #initialize hash maps
        s_map={}
        h_map={}
        #case when just one element is present
        if len(s)==1:
            return True
        #iterate through the strings
        for i in range(len(s)):
            #key already in hashmap,check if it is mapping to same element or not
            if s[i] in s_map:
                
                if s_map[s[i]]!=t[i]:
                    return False
            else:
                 s_map[s[i]]=t[i]
            #key already in hashmap,check if it is mapping to same element or not        
            if  t[i] in h_map:
                
                if  h_map[t[i]]!=s[i]:
                    return False
                
            else:
                  h_map[t[i]]=s[i]
        
                    
        return True
                
           
#method-2
#using hashmap and hashset
#iterate through the strings and map element in string s to each element in string t indexwise into a hashmap simultaneously store the values in a hashset.
#if you get a key which is already present in the hashmap check if its value is same as the current value,if not return false
#if key not in hashmap,check if value is in hashset,if yes return false (this means a letter in second string is mapped to two different letters in first string)


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        hash_map={}
        hash_set=set()
        
        for i in range(len(s)):
            #check if key in hashmap
            if s[i] in hash_map:
                #check if its value is same as current value
                if hash_map[s[i]]!=t[i]:
                    return False
            #if key is not in hashmap
            else:
                #if its value already in hashset
                if t[i] in hash_set:
                    return False
                else:
                    hash_map[s[i]]=t[i]
                    hash_set.add(t[i])
        return True

                

            
        
        
        