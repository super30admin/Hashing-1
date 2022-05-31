#Time complexity is O(nklogk)
#space complexity is O(1)
class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        dict={}
        
        for i in range(0,len(strs)):
            sortkey="".join(sorted(strs[i]))
            if sortkey not in dict:
                dict[sortkey]=[strs[i]]
            else:
                dict[sortkey].append(strs[i])
        return dict.values()