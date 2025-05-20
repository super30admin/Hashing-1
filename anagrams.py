#Time Complexity : (N * KlogK) --> N belongs to number of strings, K is max length of each string
#Space Complexity : O(N * K)
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No

#Approach:  I used a hash map to group words by their sorted character pattern so that all anagrams map to the same key. 


class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        if len(strs) <= 1:
            return [strs]
        
        anagrams_dict = {}
        for each_str in strs:
            sort_str = "".join(sorted(each_str))
            if sort_str not in anagrams_dict:
                anagrams_dict[sort_str] = [each_str]
            else:
                anagrams_dict[sort_str].append(each_str)
            
        result = []
        for value in anagrams_dict.values():
            result.append(value)
        
        return result


             

        