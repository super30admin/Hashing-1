from typing import List

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if not strs:
            return []

        hashMap = {}
        res = []

        for str in strs:
            count = [0]*26

            for ch in str:
                count[ord(ch)-ord('a')] += 1

            key = tuple(count)
            if key not in hashMap:
                 hashMap[key] = []
            hashMap[key].append(str)

        for key,values in hashMap.items():
            res.append(values)
        
        return res      

# Time Complexity: O(n*k + n)  = O(N*k)
# Space Complexity: O(nK + n + nk) = O(n*k) worse case: hashMap has n keys of O(1) and values it stores all the strings (nk)