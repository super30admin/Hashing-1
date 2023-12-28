# Time Complexity : O(N * K) where N is the number of strings and K is the average lenght of the strings
# Space Complexity : O(N * K)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# We initialize a count list for each string where we have 26 elements set to zero for each char we calculate the unicode difference we then conver this to be a touple and group them into the hashmap
# 49. Group Anagrams
# https://leetcode.com/problems/group-anagrams/

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagrams = defaultdict(list)

        for strings in strs:
            count = [0] * 26
            for char in strings:
                count[ord(char) - ord('a')] += 1
            anagrams[tuple(count)].append(strings)
        return anagrams.values()