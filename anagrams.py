 # Time Complexity : O(n*k log(k))
 # Space Complexity : O(n*k)
 # Did this code successfully run on Leetcode : Yes
 # Any problem you faced while coding this : None
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashmap = {}
        final_list = []
        for string in strs:
            sorted_str = "".join(sorted(string))
            val_list = []
            if sorted_str not in hashmap:
                hashmap[sorted_str] = []
                hashmap[sorted_str].append(string)
            else:
                hashmap[sorted_str].append(string)

        for key in hashmap:
            final_list.append(hashmap[key])
        return final_list
