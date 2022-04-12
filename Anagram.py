# O(m*n)
class Solution:
    def groupAnagrams(self, strs: list[str]) -> list[list[str]]:
        res = defaultdict(list)  # mapping charCount

        for s in strs:
            count = [0]*26

            for c in s:
                count[ord(c)-ord("a")] += 1

            res[tuple(count)].append(s)

        return res.values()
