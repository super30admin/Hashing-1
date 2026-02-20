#Group Anagrams
# create a map to group the anagrams
# the key will be the frequency of the alphabets as in anagrams character frequency are same
# for saving the frequency use the 26 length array, and once you have the freq convert to tupple and use it as key
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        mapOfCharFreq = {}
        for string in strs:
            charArr = [0]*26
            for char in string:
                index =  ord(char) - 97
                charArr[index]+=1
            charTupple = tuple(charArr)
            if charTupple in mapOfCharFreq:
                mapOfCharFreq[charTupple].append(string)
            else:
                mapOfCharFreq[charTupple] = [string]
        return list(mapOfCharFreq.values())
print(groupAnagrams(["eat","tea","tan","ate","nat","bat"]))

