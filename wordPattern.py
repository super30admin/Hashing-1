# Time Complexity : O(N) where N is the length of the input string
# Space Complexity : O(N) where N is the length of the input string
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach:
# I am using 2 hashmaps to store the mapping of the characters from pattern to words and words to those patterns. 
# I will iterate through the pattern string and then check if for the same pattern is any other word mapped to it.
# If it is then I will return false. Else I will continue to populate the hashmaps. And return true.
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        word = s.split()
        if len(pattern) != len(word):
            return False
        pMap = {}
        wMap = {}
        print("word",word)
        for i in range(len(pattern)):
            if pattern[i] in pMap:
                if pMap[pattern[i]] != word[i]:
                    return False
            pMap[pattern[i]] = word[i]
            if word[i] in wMap:
                if wMap[word[i]] != pattern[i]:
                    return False
            wMap[word[i]] = pattern[i]
        return True
        