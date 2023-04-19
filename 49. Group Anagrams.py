class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        strHashMap={}
        for i in range(len(strs)):
            s='',join(sorted(strs[i]))
            if s not in strHashMap:
                strHashMap[s]=[]
            strHashMap[s].append(strs[i])
        return strHashMap.values()
    