# Did this code successfully run on Leetcode : YES

# TC: O(M log n) where M is number of words and n is the average length of each word
# SC: O(m) to store all words

# APPROACH
# hashmap to keep track of mappings
# key is the sorted version of a word: eat, tea, ate -> all will get sorted to aet
# value is a list consisting of anagrams of the key
# in the end, return a list of all values of the mapping

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        mapping = {}
        for word in strs:
            x = ''.join(sorted(word))
            print(x)
            if x in mapping:
                mapping[x].append(word)
            else:
                mapping[x] = [word]
        return list(mapping.values())