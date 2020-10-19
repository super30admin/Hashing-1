#Time Complexity : O(n) where n is the length of input string (as both strings have to be of the same length)
#Space Complexity : O(2n) as we require two DS i.e. HashMap and Set but HashMap can contain max 26 keys as it only contains all unique letters => O(n) where n is number of unique words in the input string
#Any problem you faced while coding this : No

class Solution:
    def wordPattern(self, pattern: str, str: str) -> bool:
        strings = str.split()
        if len(strings) != len(pattern):
            return False

        mapping = {}
        seen = set()

        for c1, c2 in zip(pattern, strings):
            if c1 in mapping and mapping[c1] != c2:
                return False
            elif c1 not in mapping and c2 in seen:
                return False
            else:
                mapping[c1] = c2
                seen.add(c2)


        return True
