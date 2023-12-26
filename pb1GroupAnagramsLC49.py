"""
    ## Problem 1: Given an array of strings, group anagrams together.
       Approach : as we know words contain alphabets rangin from a-z, and strictly restricted to lower case
                    a. we can get ASCII charaters of each letter and subtract it with ASCII of a to restrict range 
                        from 0 - 26 and we can create an array mapping words to these indexes.
                        Use this array as hashKey, this enable grouping like eat and tea both have same arrays
                        and can simply get all the values. Ordering doesn't matter anyhow

"""
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        charMap = collections.defaultdict(list) # k:[0..26] v:[list of words]
        for word in strs:
            arr = [0] * 26
            for c in word:
                i = ord(c) - ord('a')
                arr[i] += 1
            charMap[tuple(arr)].append(word)
        return charMap.values()


        