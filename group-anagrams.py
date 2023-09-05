class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        map = {}

        def findkey(str):
            primeNums = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101]
            multi = 1
            for i in str:
                multi = multi * primeNums[ord(i) - ord('a')]

            return multi

        for i in strs:
            key = findkey(i)
            if key not in map:
                map[key] = [i]
            else:
                map[key].append(i)

        return list(map.values())
    
# TC: O(n)
# SC: O(n)