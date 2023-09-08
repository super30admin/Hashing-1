# Time Complexity: O(n) where n is the length of string s or t.
# Space Complexity: O(1) # max 26 chars

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        d1 =  dict()
        d2 = dict()
        for i in range(len(s)):
            char_s = s[i]
            char_t = t[i]
            if char_s in d1 and d1[char_s] != char_t:
                return False
            else:
                d1[char_s] = char_t
            if char_t in d2 and d2[char_t] != char_s:
                return False
            else:
                d2[char_t] = char_s
        return True

# class Solution:
#     def isIsomorphic(self, s: str, t: str) -> bool:
#         if s == None or t == None or len(s) == 0 or len(t) == 0 or len(s) != len(t):
#             return False
        
#         sMap = {}
#         tMap = {}

#         for i in range(len(s)):
#             sChar = s[i]
#             tChar = t[i]

#             if sChar not in sMap:
#                 sMap[sChar] = tChar
#             if tChar not in tMap:
#                 tMap[tChar] = sChar
#             if sMap[sChar] != tChar or tMap[tChar] != sChar:
#                 return False
        
#         return True
