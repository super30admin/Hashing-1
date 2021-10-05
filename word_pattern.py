"""
Time Complexity: O(n)
Space Complaxity: O(n)
Did your code run on leetcode?: yes
issues faced: I was getting confused with keys and values in the hashmap  
"""
class Solution:
    def wordPattern(self, pattern: str, s: str):
        
        str_words = s.split(" ")
        if len(str_words) != len(pattern):
            
            return False
        
        pattern_dict = dict()
        str_words_dict = dict()
        for i in range(len(pattern)):
            if pattern[i] in pattern_dict:
                if pattern_dict[pattern[i]] != str_words[i]:
                    return False
            else:
                pattern_dict[pattern[i]] = str_words[i]
            
        for i in range(len(str_words)):
            if str_words[i] in str_words_dict:
                if str_words_dict[str_words[i]] != pattern[i]:
                    return False
            else:
                str_words_dict[str_words[i]]= pattern[i]
        return True