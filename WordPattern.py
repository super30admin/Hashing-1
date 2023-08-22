#Time Complexity : O(N) where N is the length of the pattern
#Space Complexity : O(max(m, n)) where m is the length of the pattern and n is the length of the string s
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this :No

#Approach: The approach is same as the IsomorphicStrings problem. Here since s is a string, to get the words as a list, we split the string s.
#And then use the same approach of using 2 maps.

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        if pattern is None and s is None: return True
        if pattern is None or s is None: return False
        map1 = {}
        map2 = {}
        words = s.split()
        if len(pattern) != len(words):
            return False
        for i in range(0, len(pattern)):
            pchar = pattern[i]
            schar = words[i]
            if pchar in map1:
                if map1[pchar] != schar: return False
            else:
                map1[pchar] = schar
            
            if schar in map2:
                if map2[schar] != pchar: return False
            else:
                map2[schar] = pchar
        return True