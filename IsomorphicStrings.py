# Time Complexity : O(n)
# Space complexity : O(n), since we need to maintain a dictionary of size n

# The code ran on github

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:

        s_map = {}
        t_map = {}

        for i in range(len(s)):
            # If a new character is found, add it to the dictionary
            if s[i] not in s_map.keys() and t[i] not in t_map.keys():
                s_map[s[i]] = t[i]
                t_map[t[i]] = s[i]
            # Check for inconsistencies in mapping
            elif (s[i] in s_map.keys()) and (t[i] in t_map.keys()) and (s_map[s[i]] != t[i] or t_map[t[i]] != s[i]):
                return False

            elif ((s[i] in s_map.keys()) and (t[i] not in t_map.keys())) or ((s[i] not in s_map.keys()) and (t[i] in t_map.keys())):
                return False

        return True