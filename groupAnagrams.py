# TC = O(nk)
# SC = O(nk)

import math


class Solution:
    def getPrimeMultiplication(self, s):
        mul = 1
        primes = [
            2,
            3,
            5,
            7,
            11,
            13,
            17,
            19,
            23,
            29,
            31,
            37,
            41,
            43,
            47,
            53,
            59,
            61,
            67,
            71,
            73,
            79,
            83,
            89,
            97,
            101,
            103,
        ]
        for i in range(len(s)):
            mul *= primes[ord(s[i]) - ord("a")]

        return mul

    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        rmap = {}
        for i in range(len(strs)):
            mul = self.getPrimeMultiplication(strs[i])
            if mul in rmap:
                rmap[mul].append(strs[i])
            else:
                rmap[mul] = []
                rmap[mul].append(strs[i])
        return rmap.values()
