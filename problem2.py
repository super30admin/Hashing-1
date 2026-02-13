# Time Complexity: O(n), where n is the length of the string
# Space Complexity: O(n), for storing character mappings in the hashmap and the used set in the worst case.
# Approach: Use a hashmap to map each character from s to t and a set to ensure no two characters from s map to the same character in t, checking consistency in one pass.
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        smap={}
        used=set()

        for i in range(len(s)):

            sChar = s[i]
            tChar = t[i]

            if sChar in smap:
                if smap[sChar]!=tChar:
                    return False
            else:
                if tChar in used:
                    return False 
                smap[sChar]=tChar
                used.add(tChar)
        print(smap,used)
        return True  
