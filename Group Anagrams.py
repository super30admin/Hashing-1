#Problem 1
#Using Hash Maps.
#T: O(n.m)
#Outer loop over strs: Runs m times once per string s.
#Inner loop over characters c in s: Runs up to n times per string

#S: O(n.m)
#Stores every string from strs once across grouped lists, plus tuple keys of fixed size 26.


class Solution:
    def groupAnagrams(self, strs: list[str]) -> list[list[str]]:
        res = defaultdict(list)

        for s in strs:
            count = [0] * 26

            for c in s:
                count[ord(c) - ord('a')] += 1

            res[tuple(count)].append(s)

        return list(res.values())
