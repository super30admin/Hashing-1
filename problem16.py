#Time Complexity : O(1)
#Space Complexity : O(1)

#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No



class Solution(object):
    def isIsomorphic(self, s, t):
        mapping = {}
        char_set = set()
        n = len(s) - 1

        while n >= 0:
            if s[n] in mapping and mapping[s[n]] != t[n]:
                return False
            if s[n] not in mapping and t[n] in char_set:
                return False
            char_set.add(t[n])
            mapping[s[n]] = t[n]
            n -= 1

        return True


