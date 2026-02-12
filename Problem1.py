# https://leetcode.com/problems/group-anagrams/

# Time Complexity : O(m*n)
# Space Complexity : O(m*n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach in three sentences only
# Approach:
# The problem statement asks for grouping of anagrams and return a list as the result. This solution focuses on maintaining 
# a count array of size 26 for every string you encounter. The count array will have the frequency of each characters in the 
# current string. Using the ASCII comparison we are placing the alphabets a-z to start from 0th index (ord(c) - ord("a")). 
# We are maintaining a hashmap with key being the count array and the value being the list with all the anagrams

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        my_dict = defaultdict(list)

        for s in strs:
            count = [0] * 26
            for c in s:
                count[ord(c) - ord("a")] += 1
            my_dict[tuple(count)].append(s)

        return list(my_dict.values())