# Time Complexity :  O(N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : Yes      
# Any problem you faced while coding this : No  

# Your code here along with comments explaining your approach: Map each character in pattern to each string in list of strings in the same order and vice versa using another hashMap. While updating each HashMap, if a false mapping exists in any hashMap at any point of iteration, return False. If everything goes correctly, return True. 

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s_words = s.split(" ")
        if len(s_words) != len(pattern):
            return False
        
        pattern_dict = {}
        s_dict = {}

        for i in range(len(pattern)):
            if pattern[i] in pattern_dict:
                if pattern_dict[pattern[i]] != s_words[i]:
                    return False
            
            else:
                pattern_dict[pattern[i]] = s_words[i]
        
        for i in range(len(s_words)):
            if s_words[i] in s_dict:
                if s_dict[s_words[i]] != pattern[i]:
                    return False
            
            else:
                s_dict[s_words[i]] = pattern[i]
        
        return True