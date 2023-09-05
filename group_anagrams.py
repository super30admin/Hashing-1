# Time Complexity: O(nm lg m) where n is the number of words in the list and m is the average length of words.
# Space Complexity: O(n) where n is the number of words in the list.
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this : No

# - Create a map where the key is the sorted alphabets and the value is the list of words formed using the letters in the key.
# - Return the list of values consisting of list of anagrams grouped.
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        d = dict()
        for item in strs:
            key = tuple(sorted(list(item)))
            if key not in d:
                d[key] = []
            d[key].append(item)
        return d.values()
