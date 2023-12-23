#Time Complexity:- O(n)
# Space Complexity:-O(1)
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        
        char_map = {}  # Use a dictionary to map characters from s to t.
        seen = set()   # Use a set to keep track of characters already mapped in t.

        for i in range(len(s)):
            original = s[i]
            replacement = t[i]

            if original in char_map:
                if char_map[original] != replacement:
                    return False
            else:
                if replacement in seen:
                    return False
                char_map[original] = replacement
                seen.add(replacement)

        return True
