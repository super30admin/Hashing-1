class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        '''
        # Time complexity is O(N*Klog(K)) where N is len of strs and K is max len of a string in strs
        sorted_strs = []
        for i in range(len(strs)):
            sorted_strs.append(tuple(sorted(strs[i])))  # space complexity = O(N*K)
            # sorted_strs.append("".join(sorted(strs[i]))) # space complexity = O(N)

        hash_map = {}
        for i in range(len(strs)):
            if sorted_strs[i] in hash_map:
                hash_map[sorted_strs[i]].append(strs[i])
            else:
                hash_map[sorted_strs[i]] = [strs[i]]

        return hash_map.values()
        '''

        # Best
        # Time complexity O(N*K)
        # Space complexity O(N*K)

        ans = collections.defaultdict(list)
        for s in strs:
            count = [0] * 26
            for c in s:
                count[ord(c) - ord('a')] += 1
            ans[tuple(count)].append(s)
        print(ans)
        return ans.values()

