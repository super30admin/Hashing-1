# 49. Group Anagrams

# Time Complexity: O(Nklogk)
# Space Complexity: O(N)

class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        res = list()
        map = dict()

        for i in strs:
            SortedI = ''.join(sorted(i))
            if SortedI not in map:
                map[SortedI] = [i]
            else:
                map[SortedI].append(i)
        
        for i in map:
            res.append(map[i])
        
        return res