# Time Complexity : O(n)
# Space Complexity :O(n)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : No

class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        char_map={}
        word_map={}
        s_new=s.split()
        print(len(pattern))
        if(len(pattern)!=len(s_new)):
            return False
        for char1, word in zip(pattern, s_new):
            if ((char1 in word_map and word_map[char1]!=word) or (word in char_map and char_map[word]!=char1)):
                return False
            word_map[char1]=word
            char_map[word]=char1
        return True
