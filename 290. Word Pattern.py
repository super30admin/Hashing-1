# Time: O(n) for looping through the string and then the lookup is O(1)
# Space: O(n + n) which is O(n)

# Create 2 maps 1 with pattern to string mapping to check if there are no same words associated for a particular char in pattern
# The 2nd map with string to pattern mapping to check if there are no same chars for a particular word

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        first_map = {}
        second_map = {}
        words = s.split()
        if (len(words) != len(pattern)):
            return False
        for i in range(0,len(pattern)):
            if pattern[i] in first_map and first_map[pattern[i]] != words[i]:
                return False
            elif words[i] in second_map and second_map[words[i]] != pattern[i]:
                return False
            else:
                first_map[pattern[i]] = words[i]
                second_map[words[i]] = pattern[i]
        return True