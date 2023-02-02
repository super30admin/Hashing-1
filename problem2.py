class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if(len(s)!=len(t)):
            return False
        s_map={}
        t_set=set()
        for i in range(len(s)):
            if(s[i] in s_map):
                if(s_map[s[i]]!=t[i]):
                    return False
            else:
                if(t[i] in t_set):
                    return False
                else:
                    s_map[s[i]]=t[i]
                    t_set.add(t[i])
        return True
s=Solution()
print(s.isIsomorphic("egg","add"))