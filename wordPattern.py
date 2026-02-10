# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Approach:
# Split the input string into words. Use a hashmap to map each character in `pattern` to a word.
# Iterate once through the pattern and validate.

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split()
        if len(words) != len(pattern):
            return False

        h_map = {}
        used = set()

        for i in range(len(pattern)):
            if pattern[i] not in h_map:
                if words[i] in used:
                    return False
                h_map[pattern[i]] = words[i]
                used.add(words[i])
            else:
                if h_map[pattern[i]] != words[i]:
                    return False

        return True
