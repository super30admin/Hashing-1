# Time Complexity : O(N*K*LogK)
# Space Complexity : O(N*K)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
class Solution(object):
    def stringSort(self, str):
        sort_str_lst = sorted(str)
        result_str = ""

        for i in sort_str_lst:
            result_str += i

        return result_str
        
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        dict = {}
        aggregate_list = []

        for str in strs:
            sortedStr = self.stringSort(str)

            if sortedStr not in dict:
                dict[sortedStr] = []
                dict[sortedStr].append(str)
            else:
                dict[sortedStr].append(str)
        
        for k in dict:
            list = dict[k]

            aggregate_list.append(list)

        return aggregate_list
