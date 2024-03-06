#Time Complexity: O(nklogk) where O(n) is for iterating through array and O(klogk) for sorting
#Space Complexity: O(nk)
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dict = {}
        for str in strs:
            sorted_val = ''.join(sorted(str))
            if sorted_val not in dict:
                dict[sorted_val]= [str]
            else:
                dict[sorted_val]+=[str]
        return list(dict.values())
