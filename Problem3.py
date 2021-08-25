class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        sMap = {}
        tMap = {}
        x = s.split(' ')
        if len(pattern) != len(x):
            return False
        for idx, val in enumerate(pattern):

            if val in sMap:

                if sMap[val] != x[idx]:
                    return False
            else:
                sMap[val] = x[idx]

            if x[idx] in tMap:

                if tMap[x[idx]] != val:
                    return False
            else:
                tMap[x[idx]] = val

        return True