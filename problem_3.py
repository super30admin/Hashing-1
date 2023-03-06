# Time Complexity: O(n)
# Space Complexity: O(n)


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        dictionary_s = {}
        dictionary_pattern = {} 
        s = list(s.split(" "))
        if len(s) != len(pattern): 
            return False 
        
        for i in range(len(s)) : 
            if s[i] in dictionary_s : 
                if (dictionary_s[s[i]] != pattern[i]) : 
                    return False 
            else : 
                dictionary_s[s[i]] = pattern[i]
            if pattern[i] in dictionary_pattern : 
                if (dictionary_pattern[pattern[i]] != s[i]) : 
                    return False 
            else : 
                dictionary_pattern[pattern[i]] = s[i]


        return True
