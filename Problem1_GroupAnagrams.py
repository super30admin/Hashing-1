# Time Complexity : O(n * k log k) where n is number of strings and k is average length
# Space Complexity : O(n * k) for storing the grouped anagrams
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Approach: Sort each string to create a canonical key for anagrams, as all anagrams will have the same sorted representation.
# Use a dictionary to group strings by their sorted key, where each key maps to a list of anagram strings.
# Return all the grouped lists from the dictionary values.

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagram_map = {}
        
        for s in strs:
            # Sort the string to create a key
            sorted_key = ''.join(sorted(s))
            
            # Add to the map
            if sorted_key not in anagram_map:
                anagram_map[sorted_key] = []
            anagram_map[sorted_key].append(s)
        
        return list(anagram_map.values())

