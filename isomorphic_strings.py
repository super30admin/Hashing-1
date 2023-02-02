# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


# // Your code here along with comments explaining your approach in three sentences only
# The commented approach is where I have used 2 dictionaires to map the corresponding characters with respect to the same indexes for t and s. If the key is already 
# existing in the dictionary, then further we are checking if that key belongs to the same character which it was previously mapped with, if not then it is not isomorphic.
# The uncommented approach is where I have used a set instead of a second dictionary to keep track of the values which are used already in the dictionary.
# If there is another value with the same character but for a different key then it returns False


class Solution:
    def isIsomorphic(self, s, t):
        if len(s) != len(t):
            return False
        # smap, tmap = dict(), dict()
        # for i in range(len(s)):
        #     if s[i] in smap:
        #         if smap[s[i]] != t[i]:
        #             return False
        #     else:
        #         smap[s[i]] = t[i]
        #     if t[i] in tmap:
        #         if tmap[t[i]] != s[i]:
        #             return False
        #     else:
        #         tmap[t[i]] = s[i]
        # return True
        smap = dict()
        tset = set()
        for i in range(len(s)):
            if s[i] in smap:
                if smap[s[i]] != t[i]:
                    return False
            elif t[i] in tset:
                return False
            else:
                smap[s[i]] = t[i]
                tset.add(t[i])  
        return True