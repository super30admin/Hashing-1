## Problem 1:
# Given an array of strings, group anagrams together.
#
# Example:
# Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
# Output:
# [
#     ["ate","eat","tea"],
#     ["nat","tan"],
#     ["bat"]
# ]
#
# Note:
# All inputs will be in lowercase.
# The order of your output does not matter.

# Time Complexity : O(nk)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


import sympy


class Solution(object):
    def groupAnagrams(strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        if not strs:
            return []

        result = {}
        lookup_hash = list(sympy.primerange(0, 150))
        print(lookup_hash)

        def getHashKey(str):
            hashValue = 1
            for char in str:
                index_val = ord(char) - ord('a')
                hashValue = hashValue * lookup_hash[index_val]
            return hashValue

        for s in strs:
            hashKey = getHashKey(s)

            if hashKey not in result:
                result[hashKey] = [s]
            else:
                hashValue = result.get(hashKey)
                hashValue.append(s)

        return result.values()

    strs = ["eat","tea","tan","ate","nat","bat"]
    output = groupAnagrams(strs)

    print(output)

