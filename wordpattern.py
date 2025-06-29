#Time Complexity: O(n)
#Space Complexity: O(n)
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        splits = s.split()
        if len(pattern) != len(splits):
            return False

        res = [None] * 26
        out = set()

        for i in range(len(pattern)):
            index = ord(pattern[i]) - ord('a')

            if res[index] is not None:
                if res[index] != splits[i]:
                    return False
            else:
                if splits[i] in out:
                    return False
                res[index] = splits[i]
                out.add(splits[i])

        return True

