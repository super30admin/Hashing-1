# Time Complexity: O(n * k * logk)
# Space Complexity: O(n * k), n is the length of the input list strs 
# and k is the maximum length of a string in the list



class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        out = []
        dictionary = {}

        for each in strs: 
            sorted_word = ''.join(sorted(each))
            
            if sorted_word in dictionary: 
                dictionary[sorted_word].append(each)
            else : 
                dictionary[sorted_word] = [each]
        return dictionary.values()
        


