# Time Complexity : O(n)
# Space Complexity :O(n)
# Leet Code: Yes

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        
        word_arr = s.split(' ')
        if len(pattern) != len(word_arr):
            return False
        n = len(pattern)
        hashmap = {}
        hashset = set()

        for i in range(n):
            if pattern[i] not in hashmap and word_arr[i] not in hashset:
                hashmap[pattern[i]] = word_arr[i]
                hashset.add(word_arr[i])

            elif pattern[i] not in hashmap and word_arr[i] in hashset:
                return False
            
            elif hashmap[pattern[i]] != word_arr[i]:
                return False

        return True