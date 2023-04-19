"""
Time Complexity : O(n* klogk)
Space Complexity : O(nk)
where n is the number of elements in strs and k is the average length of words in strs

Did this code successfully run on Leetcode : Yes

Your code here along with comments explaining your approach:
1. Sort the each word in strs and add this word in hashMap.
2. hashMap will have key as sorted word and value as list of words matching with the sorted word
3. For all the words in strs, check if its sorted word is present in hashMap yes append the original word in the value list of that hashMap.
4. At the end return all the values of hashMap

"""
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        result = []
        hashMap = {}
    
        if len(strs) == 0:
            return result.append([])
        
        for word in strs:
            sortedWord = ''.join(sorted(word))
            if sortedWord not in hashMap:
                hashMap[sortedWord] = []
            hashMap[sortedWord].append(word)
        
        for val in hashMap.values():
            result.append(val)
        
        return result