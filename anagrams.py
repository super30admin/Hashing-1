class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        mp = defaultdict(list)

        for s in strs:
            count = [0] * 26

            for ch in s:
                count[ord(ch) - ord('a')] += 1

            key = tuple(count)
            mp[key].append(s)

        return list(mp.values())

#TC - O(n * k)  k is length of each string
#SC - O(n * k)