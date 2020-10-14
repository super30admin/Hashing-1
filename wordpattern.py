# using two hash maps
# traverse the pattern and the string
# keep track of which character in the pattern matches with the substring and store in a hash map, and vice-versa.
# Return False, if -
# if the character in the pattern is already in the hash map and maps to a different substring.
# if the substring is already in the hash map and maps to a different character in the pattern.
# Else, return True
# Time complexity - O(n)
# Space complexity - O(m) - for unique substrings.
#                   for character hashmap - O(1)
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        bijectionMap = dict()
        bijectionMapRev = dict()
        s = s.split(" ")
        if len(s)!=len(pattern):
            return False
        
        for i in range(len(pattern)):
            if pattern[i] not in bijectionMap and s[i] not in bijectionMapRev:
                bijectionMap[pattern[i]] = s[i]
                bijectionMapRev[s[i]] = pattern[i]
            elif (pattern[i] in bijectionMap and bijectionMap[pattern[i]] != s[i]) or (s[i] in bijectionMapRev and bijectionMapRev[s[i]] != pattern[i]):
                return False
        return True
    