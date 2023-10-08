from typing import List  # Import List from the typing module
import collections

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        ans = collections.defaultdict(list)

        for s in strs:
            count = [0] * 26
            for c in s:
                count[ord(c) - ord("a")] += 1
            ans[tuple(count)].append(s)
        return ans.values()

obj = Solution()
answer = obj.groupAnagrams(["nat", "bat", "cat", "tac"])
print(answer)
