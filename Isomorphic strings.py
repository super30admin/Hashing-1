# Time Complexity: O(n)
# Space Complexity: O(1) because the hashmaps are gonna cap out at size 26 in worst case everytime because of alphabet range

# Leetcode 205
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        map1 = {}
        map2 = {}
        ptr = 0
        while ptr < len(s):
            if s[ptr] not in map1:
                map1[s[ptr]] = t[ptr]
            if t[ptr] not in map2:
                map2[t[ptr]] = s[ptr]
            if map1[s[ptr]] != t[ptr] or map2[t[ptr]] != s[ptr]:
                return False
            ptr += 1
        return True