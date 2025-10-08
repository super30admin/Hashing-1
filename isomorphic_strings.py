
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:

        if len(s) != len(t):
            return False
        
        sHash, tHash = {}, {}

        for x, y in zip(s, t):
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
