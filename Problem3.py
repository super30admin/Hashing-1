#Similar to Problem 2 
#Time complexity : O(N+M)where NNN represents the length of s and MMM represents the length of pattern. All operations in the algorithm are linear with the length of the inputs.

#Space complexity : O(W) where WWW represents the number of unique words in s. Even though we have two hash maps, the character to word hash map has space complexity of O(1)O(1)O(1) since there can at most be 26 keys.
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        mapping_pattern={}
        mapping_word={}

        words = s.split(' ')
        if len(words) != len(pattern):
            return False

        for c1 ,c2 in zip(pattern,words):
            if (c1 not in mapping_pattern) and (c2 not in mapping_word):
                mapping_pattern[c1]=c2
                mapping_word[c2]=c1

            elif mapping_pattern.get(c1)!=c2:
                return False
        return True