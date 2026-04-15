class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        mapp = {}
        for i in range(len(strs)):
            word = "".join(sorted(strs[i]))
            if word in mapp:
                mapp[word].append(strs[i])
            else:
                mapp[word] = [strs[i]]
        return list(mapp.values())
