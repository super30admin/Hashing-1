# Time Complexity : O(n)
# Space Complexity : O(k)
# Did this code successfully run on Leetcode : Yes
#
# Any problem you faced while coding this :
#   - Forgetting to compare len(pattern) with the number of words (len(si)) causes index issues.
#   - Not enforcing both directions (pattern→word AND word→pattern) can accept invalid cases.
#   - Beware that s.split() (without args) splits on any whitespace and collapses multiple spaces.

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        # Split the string into words by whitespace (multiple spaces are handled)
        si = s.split()
        if len(pattern) != len(si):
            return False
        pMap = {} # maps pattern char -> word
        sMap = {} # maps word -> pattern char

        # Walk both sequences together
        for pChar, w in zip(pattern, si):
            # If we've seen this pattern char, it must always map to the same word
            if pChar in pMap:
                if pMap[pChar] != w:
                    return False
            else:
                pMap[pChar] = w # first time: record mapping

            # If we've seen this word, it must always map back to the same pattern char
            if w in sMap:
                if sMap[w] != pChar:
                    return False
            else:
                sMap[w] = pChar # first time: record reverse mapping

        return True
