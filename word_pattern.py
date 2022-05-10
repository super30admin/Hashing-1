class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        
        '''O(n) Time complexity
            O(n) space complexity'''
        
        hash_map1={}
        hash_map2={}
        
        
        string_list=s.split(' ')
        
        if len(string_list)!=len(pattern):
            return False
        
        for i in range(len(pattern)):
            
            if pattern[i] in hash_map1:
                if hash_map1[pattern[i]]!=string_list[i]:
                    return False
            else:
                hash_map1[pattern[i]]=string_list[i]
            
            if string_list[i] in hash_map2:
                if hash_map2[string_list[i]]!=pattern[i]:
                    return False
            else:
                hash_map2[string_list[i]]=pattern[i]
        return True
                    
        
        
        