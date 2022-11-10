## Problem 1: Given an array of strings, group anagrams together.
# Example:
# Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
# Output:
# [
#   ["ate","eat","tea"],
#   ["nat","tan"],
#   ["bat"]
# ]

# code explaination:
# 1. using the hash "d", I am trying to place the keys which are sorted
# 2. I am also making sure if such element exsists, then I am appending the same element as a value to that respective key
# 3. Hence all the values are lists of anagrams, and then returning them as a list
# TC : O(n * mlog m), where n is the length of the strs and m is the average length of the elements in strs
# SC : O(n * m) 
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        d = {}
        if len(strs)==1:
            return [strs]
        for i in strs:
            res = "".join(sorted(i))
            print(res)
            if res not in d:
                d[res] = [i]
            else:
                d[res].append(i)
        return list(d.values())