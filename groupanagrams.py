#Time Complexity: O(n)
#Space Complexity: O(n)
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res = defaultdict(list)

        def helper(s):

            prime = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43,
                     47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]

            val = 1
            for i in s:
                val *= prime[ord(i) - ord('a')]

            return val

        for i in strs:
            primeval = helper(i)
            res[primeval].append(i)

        return list(res.values())





