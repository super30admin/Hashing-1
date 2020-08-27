# Time Complexity : O(n) n -represent no. of word in str
# Space Complexity : O(k) k - represent no. of unique charaters
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def wordPattern(self, pattern: str, wordlist: str) -> bool:
        map_index = {}
        words = wordlist.split()
        
        if len(pattern) != len(words):
            return False
        
        for i in range(len(words)):
            c = pattern[i]
            w = words[i]

            char_key = 'char_{}'.format(c)
            char_word = 'word_{}'.format(w)
            
            if char_key not in map_index:
                map_index[char_key] = i
            
            if char_word not in map_index:
                map_index[char_word] = i 
            
            if map_index[char_key] != map_index[char_word]:
                return False
        
        return True