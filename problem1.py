# // Time Complexity :  O(n*klogk) where n is the number of strings in the input list and k is the max length of the strings
# // Space Complexity : O(nk) where n is the number of strings in the input list and k is the length of array to store the anagrams
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : NA

class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        res={}

        for s in strs:
            sorted_s = ''.join(sorted(s))
            
            if sorted_s in res:
                res[sorted_s].append(s)
            else:
                res[sorted_s]=[s]

        return_res = list(res.values())
        return return_res
        
