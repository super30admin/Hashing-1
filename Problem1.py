'''
Problem: Group Anagrams
Time Complexity: O(nklogk), where n is strs length and k is maximum length of string
Space Complexity: O(nk)
Did this code successfully run on Leetcode: Yes
Any problem you faced while coding this: No
Your code here along with comments explaining your approach:
        created a dictionary 
        stored sorted string in dictionary
        key i ssorted string and value is given string 
'''

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dicts = defaultdict(list)

        for s in strs:
            c = sorted(s)
            dicts["".join(c)].append(s)

        return dicts.values() 