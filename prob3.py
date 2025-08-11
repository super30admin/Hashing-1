# LeetCode Problem 290: Word Pattern https://leetcode.com/problems/word-pattern/
# This solution uses two hashmaps to check if the pattern matches the string s.
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        map_ps = {}
        map_sp = {}
        s = s.split(' ')
        # Check if the lengths of pattern and s match
        if len(pattern)!=len(s):
            return False
        for i,j in zip(pattern,s):
            # If the character from pattern is already mapped to a word in s or the word from s is already mapped to a character in pattern
            # we check if the mapping is consistent, else we return False
            if i in map_ps and map_ps[i]!=j or j in map_sp and map_sp[j]!=i:
                    return False
            # If not mapped, we create the mapping
            map_ps[i]=j
            map_sp[j]=i
        return True
        