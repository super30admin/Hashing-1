class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        from collections import defaultdict
        ans = {}

        def prime(s):
            result = 1
            prime = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,
                     101, 103]
            for i in s:
                result = result * prime[ord(i) - ord('a')]
            return result

        for idx, val in enumerate(strs):
            res = prime(val)

            if res not in ans:
                ans[res] = [val]
            else:
                ans[res].append(val)
        return ans.values()
