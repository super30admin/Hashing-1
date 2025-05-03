#Word Pattern#
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        p=list(pattern)
        st=s.split()
        if len(p)!=len(st):
            return False
        mapP = {}
        mapW = {}
        for i in range(len(p)):
            if p[i] not in mapP:
                mapP[p[i]] = st[i]
            elif mapP[p[i]] != st[i]:
                return False
            if st[i] not in mapW:
                mapW[st[i]] = p[i]
            elif mapW[st[i]] != p[i]:
                return False
        return True