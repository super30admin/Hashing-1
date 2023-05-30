"""
Problem : 3

Time Complexity : O(1)
Space Complexity : O(1)

Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

splitting the source string into space seperated array of words
then taking two hashmaps to store mapping from pattern to s and s to pattern
if found some pattern not satisfying the previous pattern then returning false
"""
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        news=s.split(" ")
        if len(news)!=len(pattern):
            return False
        pdict={}
        sdict={}

        for i,j in zip(pattern,news):
            if i in pdict:
                if pdict[i]!=j:
                    return False
            else:
                pdict[i]=j
            if j in sdict:
                if sdict[j]!=i:
                    return False
            else:
                sdict[j]=i            
        return True