# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Your code here along with comments explaining your approach in three sentences only
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        # Splitting words based on space and it will be returned as list
        s = s.split()
        # Need a hashmap for pattern string
        map_pattern = {}
        # Need a hashmap for s string reverse mapping
        map_s = {}
        #If number of elements are not matching can false by default
        if len(pattern) != len(s):
            return False
        #Loop through s or pattern since they will be of equal length
        for i in range(len(s)):
            # Check if element not available in hashmap
            if pattern[i] not in map_pattern:
                # Assign element from pattern as key and element in s as key
                map_pattern[pattern[i]] = s[i]
            else:
                # If seen in the hashMap then check if not equal to the element in s then return False
                if map_pattern[pattern[i]] != s[i]:
                    return False
            # Now checking if element in s not in s map
            if s[i] not in map_s:
                # adding key and value in the s map, basically reverse mapping
                map_s[s[i]] = pattern[i]
            else:
                # If seen in map and not equal to the element in pattern then return False
                if map_s[s[i]] != pattern[i]:
                    return False
        # If no return is touched in the for loop and it reaches here it means True
        return True
