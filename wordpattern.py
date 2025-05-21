class Solution(object):
    def wordPattern(self,pattern,s):
        words=s.split()
        if len(pattern)!=len(words):
            return False
        
        char_to_word={}
        word_to_char={}

        for p_char,word in zip(pattern,words):
            if p_char in char_to_word:
                if char_to_word[p_char]!=word:
                    return False
            else:
                if word in word_to_char:
                    if word_to_char[word] !=p_char:
                        return False
                char_to_word[p_char]=word
                word_to_char[word]=p_char
        return True
    
#Test cases
sol=Solution()
print(sol.wordPattern("abba","dog cat cat dog"))
print(sol.wordPattern("abba","dog cat cat fish"))
print(sol.wordPattern("aaaa","dog cat cat dog"))
                