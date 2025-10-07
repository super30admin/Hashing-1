class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # Solution 2 - Prime Multiplication as Key
        map = {}
        for i in range(len(strs)):
            key = self.primeFactor(strs[i])
            if key in map:
                map[key].append(strs[i])
            else:
                map[key] = [strs[i]]
        return list(map.values())

    def primeFactor(self,str):
        prime = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        result = 1
        for ch in str:
            pr = prime[ord(ch) - ord('a')]
            result = result *  pr
        return result

        # Solution 1 - sorted string as key
        # h={}
        # g=[]
        # for i in range(len(strs)):
        #     key="".join(sorted(strs[i]))
        #     if key in h:
        #         h[key].append(strs[i])
        #     else:
        #         h[key]=[strs[i]]
        # for key,value in h.items():
        #     g.append(value)
        # return g

