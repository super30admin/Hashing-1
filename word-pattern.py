''' 
Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this :  No
'''
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        hashmap = {}
        s = s.split(" ")
        if len(pattern) != len(s):
            return False
        for i in range(len(pattern)):
            if pattern[i] in hashmap:
                if s[i] != hashmap[pattern[i]]:
                    return False
            elif s[i] in hashmap.values():
                return False
            else:
                hashmap[pattern[i]] = s[i]
        return True
