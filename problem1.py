class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        sdic, vdic = {},{}
        for i in range(len(s)):
            vs, vt = s[i], t[i]
            if vs not in sdic:
                sdic[vs] = vt
            if vt not in vdic:
                vdic[vt] = vs
            if sdic[vs]!=vt or vdic[vt]!=vs:
                    return False
        return True

