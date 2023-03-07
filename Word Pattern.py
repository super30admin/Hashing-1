# Time Complexity: O(n)
# Space Complexity: O(1) because the hashmap is gonna cap out at size 26 in worst case everytime because of alphabet range
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        map1 = {}
        map2 = {}
        ptr = 0
        s = s.split(" ")
        if len(pattern) != len(s):
            return False
        l = len(pattern)
        while ptr < l:
            if pattern[ptr] not in map1:
                map1[pattern[ptr]] = s[ptr]
            if s[ptr] not in map2:
                map2[s[ptr]] = pattern[ptr]
            if map1[pattern[ptr]] != s[ptr] or map2[s[ptr]] != pattern[ptr]:
                return False
            ptr += 1
        return True