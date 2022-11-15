"""
    Problem Statement: Given an array group the anagrams together.

    Approach: In this problem we would use the concept of hashing. Create a hashmap which initially
    would be empty. Iterate over the input and sorted the input. Check the sorted input in the hash map,
    if it is present the append the original input in the array of the corresponding input key. 

    Time complexity: n log(n)
    
    Space complexity: O(1).

    Accepted on LeetCode? Yes!
    LeetCode Link: https://leetcode.com/problems/group-anagrams/
"""

from typing import List

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        mapper = {}
        for word in strs:
            sorted_word = "".join(sorted(word))
            if sorted_word not in mapper:
                mapper[sorted_word] = []
                mapper[sorted_word].append(word)
            else:
                mapper[sorted_word].append(word)
        return list(mapper.values())

if __name__ == "__main__":
    s = Solution()
    strs = ["eat","tea","tan","ate","nat","bat"]
    ret = s.groupAnagrams(strs)
    assert ret == [["eat","tea","ate"],["tan","nat"],["bat"]]