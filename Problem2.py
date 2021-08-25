class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        from collections import defaultdict
        sMap = {}
        tMap = {}

        for idx, val in enumerate(s):
            if val in sMap:
                if sMap[val] != t[idx]:
                    return False

            else:
                sMap[val] = t[idx]

            if t[idx] in tMap:
                if tMap[t[idx]] != val:
                    return False

            else:
                tMap[t[idx]] = val

        return True
