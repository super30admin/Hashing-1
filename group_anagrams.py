class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        lst = list()
        dct = dict()
        anslst = []
        for i in strs:
            lst.append(''.join(sorted(i)))
        for i in range(len(strs)):
            if lst[i] not in dct.keys():
                dct[lst[i]] = [strs[i]]
            else:
                dct[lst[i]].append(strs[i])
            

        for i in dct.values():
            anslst.append(i)

        print(anslst)

        return anslst
