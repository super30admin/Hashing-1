# Time Complexity: O(N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: No


# Your code here along with comments explaining your approach
# if length of given string s and t are not equal return False
# We need two HashMaps one to check s is isomorphic with t and other to check t is isomorphic with s
# If we see any wrong mapping like two characters mapping to the same character in other string return False

class Solution:
    def isIsomorphic(self, s: str, t: str):
        if len(s) != len(t):
            return false
        mapS = {}
        mapT = {}
        for i in range(len(s)):
            if s[i] not in mapS:
                mapS[s[i]] = t[i]
            else:
                if mapS[s[i]] != t[i]:
                    return False

            if t[i] not in mapT:
                mapT[t[i]] = s[i]
            else:
                if mapT[t[i]] != s[i]:
                    return False
        return True