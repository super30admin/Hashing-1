class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:        
        s_list = s.split(" ")
        
        if len(s_list) != len(pattern):
            return False
        hashMap_CHAR_TO_WORD = {}
        hashMap_WORD_TO_CHAR = {}
        for index in range(len(pattern)):
            char = pattern[index]
            word = s_list[index]
            
            if char not in hashMap_CHAR_TO_WORD:
                hashMap_CHAR_TO_WORD[char] = word
            
            if hashMap_CHAR_TO_WORD[char] != word:
                return False
            
            
            if word not in hashMap_WORD_TO_CHAR:
                hashMap_WORD_TO_CHAR[word] = char
            
            if hashMap_WORD_TO_CHAR[word] != char:
                return False
            
            
        return True
            

