class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        cmap = {}
        smap = {}
        str = s.split(" ")
        if len(str) != len(pattern):
            return False
        print(str)
        for i in range(len(str)):
            if pattern[i] not in cmap and str[i] not in smap:
                cmap[pattern[i]] = str[i]
                smap[str[i]] = pattern[i]

            elif cmap.get(pattern[i]) != str[i] and smap.get(str[i]) != pattern[i]:
                return False
        return True

# TC: O(n)
# SC: O(1)