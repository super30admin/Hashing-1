# Time Complexity : O(n * k log k) where n is the number of words and k is the length of the longest word
# Space Complexity : O(n * k)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

'''
My approach:
For each word, sort it and add it to the wordMap.
The key is the sorted word and the value is a list of original words that are anagrams.
'''
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        wordMap = dict() # Stores mapping of sorted word -> [original words]

        for word in strs:
            sortedWord = ''.join(sorted(word))
            if sortedWord not in wordMap:
                wordMap[sortedWord] = []
            wordMap[sortedWord].append(word)

        return list(wordMap.values())