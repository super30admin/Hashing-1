#Time and Space: O(n)

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        ans = {}

        for s in strs:
            count = [0] * 26
            for c in s:
                count[ord(c) - ord('a')] += 1
            
            z = tuple(count)

            if z in ans:
                ans[z].append(s)
            else:
                ans[z] = [s]

        result = list(ans.values())

        return result
