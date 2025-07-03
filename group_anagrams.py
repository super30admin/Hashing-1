# Time Complexity : O(n*klogk) n is number of strings, k is length of strings
# Space Complexity : O(n*k)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Your code here along with comments explaining your approach in three sentences only

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        #Initializing a map
        track_map = {}
        #looping through each element
        for str_ in strs:
            # sorting the element,Reason : So that you can sort every element and compare with other elements
            sorted_str = ''.join(sorted(str_))
            # Checking if we have seen the sorted element in the hashmap
            if sorted_str not in track_map:
                # If not seen then insert the sorted element as key and empty list as value
                track_map[sorted_str] = []
            # Appending the elements as values for the sorted string key
            track_map[sorted_str].append(str_)
        # Returning the values from the hashmap
        return list(track_map.values())



