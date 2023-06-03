class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        d = {}
        l = s.split(" ")

        if len(l) != len(pattern):
            return False 

        for idx, ch in enumerate(pattern):
            if ch not in d.keys() and l[idx] not in d.values():
                d[ch] = l[idx]
            elif ch not in d.keys():
                return False
            elif d[ch] != l[idx]:
                return False
        return True