# Time Complexity : O(n * k log k), where n is the number of strings and k is the maximum string length.
# Space Complexity : O(n * k)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : I had to choose a key that stays identical for words with the same letters.
# Approach: I sorted each word and used the sorted result as the hash map key.
# Words with the same sorted key are anagrams, so they go into the same list.
# At the end, I returned all grouped values from the hash map.


class Solution:

    def groupAnagrams(self, strs):
        groups = {}

        for word in strs:
            key = ''.join(sorted(word))

            if key not in groups:
                groups[key] = []

            groups[key].append(word)

        return list(groups.values())
