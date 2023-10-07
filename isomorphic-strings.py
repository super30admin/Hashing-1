class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        smap = {}
        tmap = {}

        # if length of strings dont match or either of the string is of 0 length, return False
        if len(s) == 0 or len(t) == 0:
            return False
        if len(s) != len(t):
            return False

        # Iterate through the strings and see if the character is present in their respective maps. IF not, add them.
        # if char is present, compare values in both the maps to ensure that single character maps to the same character both ways.
        # TC: O(n)
        # SC: O(26) max even if the length of strings increase. Therefore constant O(1)
        for i in range(len(s)):  # TC: O(n)
            if s[i] not in smap:
                smap[s[i]] = t[i]  # TC: O(1)
            elif smap[s[i]] != t[i]:
                return False

            if t[i] not in tmap:
                tmap[t[i]] = s[i]  # TC: O(1)
            elif tmap[t[i]] != s[i]:
                return False
        return True


obj = Solution()
obj.isIsomorphic("abb", "egg")
