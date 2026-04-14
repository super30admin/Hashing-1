# // Time Complexity : O(n+m) where n is the length of the pattern and m is the number of words in the string s
# // Space Complexity : O(n+m) where n is the number of characters in the pattern and m is the number of unique words in the string s
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : NA

class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        
        words=s.split(" ")
        if len(pattern)!=len(words) : return False

        pMap={}
        wset=set()

        for p, word in zip(pattern,words):
            if p in pMap:
                if pMap[p]!=word:
                    return False
            else:
                if word in wset:
                    return False
                pMap[p] = word
                wset.add(word)

        return True
