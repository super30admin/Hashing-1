# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Use a hashmap and a set, first check if length of split s is equal to pattern then only proceed.
# Then for each char pattern check if it was already presented in hashmap, if yes and if its not the same word
# then return False, or else return True. Also use a set to check if same string was not mapped to another pattern.

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        new_dict = {}
        used = set()
        words = s.strip().split()
        if len(pattern) != len(words):
            return False
        for i in range(len(pattern)):
            if pattern[i] in new_dict:
                if new_dict[pattern[i]] != words[i]:
                    return False
            else:
                if words[i] in used:
                    return False
                new_dict[pattern[i]] = words[i]
                used.add(words[i])

        return True