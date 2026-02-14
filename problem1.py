## Problem 1:
## Given an array of strings, group anagrams together.

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        final_dict = {}

        for str_vals in strs:
            a = [x for x in str_vals]
            a.sort()
            a = ''.join(a) 
            if a not in final_dict:
                final_dict[a]=[str_vals]
            else:
                final_dict[a].append(str_vals)
        return list(final_dict.values())