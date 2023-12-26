'''
Initialising a dictionary and while going thru each element, I make the sorted version of the string as the key
and store the actual string in the value list
'''

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagram = defaultdict(list)

        for i in strs:
            key = sorted(i)
            anagram[set(key)].append(i)

        return anagram.values()
