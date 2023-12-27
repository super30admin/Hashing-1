# time complexity: O(NK) where N is the length of strs, and K is the maximum length of a string in strs.
# space complexity: O(NK) the total information content stored in ans.
#approach: we create a dictionary with key as the sorted string and value as the list of strings that are anagrams of each other.and then we return the values of the dictionary.

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res = defaultdict(list) #mapping count to  
        for s in strs:
            count = [0] * 26 
            for c in s:
                count[ord(c) - ord("a")] += 1
            res[tuple(count)].append(s)
        return res.values()