# ## Problem 1:
# Given an array of strings, group anagrams together.

# Example:
# Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
# Output:
# [
#   ["ate","eat","tea"],
#   ["nat","tan"],
#   ["bat"]
# ]

# Note:
# All inputs will be in lowercase.
# The order of your output does not matter.

# // Time Complexity : O(n(klogk)) + O(k)
# // Space Complexity : O(nk)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


# // Your code here along with comments explaining your approach

class Solution:
    def groupAnagrams(self, strs):
        import collections
        # creating empty dictionary of lists
        result = collections.defaultdict(list)
        # for each word in strs
        for str in strs:
            # sort the word "aet"
            sorted_str = sorted(str)
            # if sorted word not a key
            if sorted_str not in result:
                # then add as key and add the word
                result[sorted_str] = result[sorted_str].append(str)
            else:
                # append to list
                result[sorted_str].append(str)
        return result.values()
