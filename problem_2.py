# Time Complexity: O(n)
# Space Complexity: O(n)


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        dictionary_s = {}
        dictionary_t = {}
        
        for i in range(len(s)) : 
            if s[i] in dictionary_s : 
                if (dictionary_s[s[i]] != t[i]) : 
                    return False 
            else : 
                dictionary_s[s[i]] = t[i]
            if t[i] in dictionary_t : 
                if (dictionary_t[t[i]] != s[i]) : 
                    return False 
            else : 
                dictionary_t[t[i]] = s[i]


        return True


        
            
            