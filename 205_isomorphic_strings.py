class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:

        if len(s) != len(t):
            return False

        # Two Hashmap technique

        # smap={}
        # tmap={}

        # for i in range(len(s)):

        #     if smap.get(s[i]):
        #         if smap[s[i]]!=t[i]:
        #             return False
        #     else:
        #         smap[s[i]]=t[i]

        #     if tmap.get(t[i]):
        #         if tmap[t[i]]!=s[i]:
        #             return False
        #     else:
        #         tmap[t[i]]=s[i]
        # return True

        # 1 hashmap and 1 set

        # smap={}
        # tset=set()

        # for i in range(len(s)):
        #     sc=s[i]
        #     tc=t[i]

        #     if sc in smap:
        #         if smap[sc]!=tc:
        #             return False
        #     else:
        #         if tc in tset:
        #             return False
        #         smap[sc]=tc
        #         tset.add(tc)
        # return True

        # 2 arrays

        s_map = [0] * 128
        t_map = [0] * 128

        for i in range(len(s)):

            s_char = ord(s[i])
            t_char = ord(t[i])

            if s_map[s_char] != t_map[t_char]:
                return False

            s_map[s_char] = i + 1
            t_map[t_char] = i + 1

        return True