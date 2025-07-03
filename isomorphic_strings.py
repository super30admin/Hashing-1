# Time Complexity : O(n) ("n" is length of the input)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Your code here along with comments explaining your approach in three sentences only
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        # Comparing length of both the strings, if not matching they are not isomorphic strings
        if len(s) != len(t):
            return False
            # Initialized 2 hashmaps 1 for s key and value and another for reverse mapping
        mapS = {}
        mapT = {}
        # Looping until length of s or t does not matter since both the lengths are same if not they cannot be isomorphic and would have returned false in the above condition itself
        for i in range(len(s)):
            # Check if first element in s is present in mapS if not insert the key and value
            if s[i] not in mapS:
                mapS[s[i]] = t[i]
                # if present then compare the value with the corresponding value in t, if they are not matching return false
            else:
                if mapS[s[i]] != t[i]:
                    return False

            if t[i] not in mapT:
                # Check if first element in t is present in mapT if not insert the key and value
                mapT[t[i]] = s[i]
                # if present then compare the value with the corresponding value in s, if they are not matching return false
            else:
                if mapT[t[i]] != s[i]:
                    return False
        # if not returned false function will exit and return Tue it means strings are isomorphic
        return True
