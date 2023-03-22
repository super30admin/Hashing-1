# Time Complexity : O(nklogk) as we iterate through all words and also sorting the words
# Space Complexity : O(n) as we are storing all words in dictionary
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no


# Your code here along with comments explaining your approach
"""
Iterate though the list of strings and sort it. Store that as key if word doesnt exist, and append the words in correspondig list.
return the values of keys for final result
"""



class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        ddic = {}
        for ana in strs:
            res = ''.join(sorted(ana))
            if res in ddic:
                ddic[res].append(ana)
            else:
                ddic[res] = [ana]
        return ddic.values()
