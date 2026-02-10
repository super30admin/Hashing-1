# Time Complexity : O(n + m) where n is length of s and m is length of pattern
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Approach : Map each character and word to its index. If it already exists then there will be index mismatch.

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        map_index = {}
        words = s.split()

        if len(pattern) != len(words):
            return False

        for i in range(len(words)):
            ch = pattern[i]
            word = words[i]

            char_key = 'char_{}'.format(ch)
            char_word = 'word_{}'.format(word)

            if char_key not in map_index:
                map_index[char_key] = i

            if char_word not in map_index:
                map_index[char_word] = i

            if map_index[char_key] != map_index[char_word]:
                return False

        return True
        