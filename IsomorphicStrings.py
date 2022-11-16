"""
    Problem Statement: Determing if two strings are isomorphic.

    Time complexity: O(n)
    
    Space complexity: O(1).

    Accepted on LeetCode? Yes!
    LeetCode Link: https://leetcode.com/problems/isomorphic-strings/
"""

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        mapper1 = dict()
        for x, y in zip(s, t):
            if f's{x}' not in mapper1:
                mapper1[f's{x}'] = y
            else:
                if mapper1[f's{x}'] != y:
                    return False
            if f't{y}' not in mapper1:
                mapper1[f't{y}'] = x
            else:
                if mapper1[f't{y}'] != x:
                    return False
        return True
            
if __name__ == "__name__":
    sol = Solution()

    s, t = "paper", "title"
    ret = sol.isIsomorphic(s, t)
    assert ret == True

    s, t = "foo", "bar"
    ret = sol.isIsomorphic(s, t)
    assert ret == False