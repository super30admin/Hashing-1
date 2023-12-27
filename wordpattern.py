# Time complexity : O(N), traversing through both strings
# Space complexity: O(W) where W is number of words, other hashmap is O(1) as only 26 keys are possible

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        
        words = s.split()
        map_char = {}
        map_word = {}
        
        if len(words) != len(pattern):
            return False
        
        for c, w in zip(pattern, words):
            
            if c not in map_char:
                if w in map_word:
                    return False
                else:
                    map_char[c] = w
                    map_word[w] = c
            else:
                if map_char[c] != w:
                    return False
                
        return True
        
