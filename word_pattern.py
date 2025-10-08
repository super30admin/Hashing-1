class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        
        s = s.split()

        if len(s) != len(pattern):
            return False
        
        sHash, tHash = {}, {}

        for x, y in zip(s, pattern):
            if x in sHash:
                if not sHash[x] == y:
                    return False
            else:
                sHash[x] = y

            if y in tHash:
                if not tHash[y] == x:
                    return False
            else:
                tHash[y] = x
        
        return True
