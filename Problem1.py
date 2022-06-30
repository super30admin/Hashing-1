'''
## Problem 1:
Given an array of strings, group anagrams together.

Example:
Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]

Note:
All inputs will be in lowercase.
The order of your output does not matter.

'''
'''
Time Complexity : O(N KLogK)
where n is length of input array and K is length of string
Space Complexity : O(N)
'''
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        '''
        First i will sort that string and check if that string is present in hashmap if yes append to array
        else create new hm and append to it
        return values of that hashmap
        '''
        hm = {}
        for i in strs :
            temp = "".join(sorted(i))
            if temp in hm:
                hm[temp].append(i)
            else :
                hm[temp] = []
                hm[temp].append(i)
        res = []
        for i in hm:
            res.append(hm[i])
        return res