# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA


# Approach is to pick each element in pattern and map it with a word. if the same element in pattern again comes with different word then return False else True.
class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        d={}
        s1=s.split()
        if(len(pattern)!= len(s1)):
            return False
        for i,word in zip(pattern, s1):
            print(d)
            if i in d:
                if d[i]!=word:
                    return False
            elif word in d.values():
                return False
            else:
                d[i] = word
        return True
            