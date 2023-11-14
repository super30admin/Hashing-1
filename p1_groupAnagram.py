#Sort every words in the list
#use sorted word as key 
#if the word matches to the existing key they add them in list else create a new element in the hashmap


from collections import defaultdict

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        anagramSorted = defaultdict(list)
        
        for str in strs:
            strSorted = ''.join(sorted(str))
            anagramSorted[strSorted].append(str)
        
        res = list(anagramSorted.values())
        
        return res
    
#------------------------------------------------------------------------------------------------------------------------------
#Time complexity: O(NKlogK) where N is the length of strs, and K is the maximum length of a string in strs.   