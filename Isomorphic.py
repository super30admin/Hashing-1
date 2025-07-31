# We use two hash maps to track character mappings from s → t and t → s to ensure one-to-one correspondence.
# While iterating through both strings, we check if characters are consistently mapped.
# If any inconsistency is found, we return False; otherwise, the strings are isomorphic.

class Solution(object):
    def isIsomorphic(self, s, t):
        s_to_t = {}
        t_to_s = {}

        for char_s, char_t in zip(s, t):
            if (char_s in s_to_t and s_to_t[char_s] != char_t) or \
               (char_t in t_to_s and t_to_s[char_t] != char_s):
                return False
            s_to_t[char_s] = char_t
            t_to_s[char_t] = char_s

        return True

sol = Solution()
print(sol.isIsomorphic("egg", "add"))
print(sol.isIsomorphic("foo", "bar"))
print(sol.isIsomorphic("paper", "title"))
