# Time Complexity: O(n) + O(nk) where n is the number of characters in string s and k is the avg number of characters in word string. We need to split it.  
# Space Complexity: O(1) # 26 characters in char _to_word map

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        char_word_map =  dict()
        word_set = set()
        word_list= s.split()
        if len(pattern) != len(word_list):
            return False
        for i in range(len(pattern)):
            pat = pattern[i]
            word = word_list[i]
            if  pat not in char_word_map:
                if word in word_set:
                    return False
                char_word_map[pat] = word
                word_set.add(word)
            else:
                if char_word_map[pat] != word:
                    return False
        return True
        
        # s_list = s.split(" ")
        # psmap = {}
        
        # if len(pattern) != len(s_list):
        #     return False
        
        
        # for i in range(len(pattern)):
        #     if pattern[i] not in psmap:
        #         if s_list[i] not in psmap.values():
        #             psmap[pattern[i]] = s_list[i]
        #         else:
        #             return False
        #     else:
        #         if psmap[pattern[i]] != s_list[i]:
        #             return False
        
        # return True