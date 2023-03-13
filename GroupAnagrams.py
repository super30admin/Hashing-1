#Time Complexity : O(n * k * log k)
# Space Complexity  : O(n * k )

from typing import List

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # Create an empty dictionary to store anagrams
        anagrams = {}
        
        # Iterate through each word in the input list
        for word in strs:
            # Sort the characters in the word
            sorted_word = ''.join(sorted(word))
            
            # Check if the sorted word is already in the dictionary
            if sorted_word in anagrams:
                # If it is, add the word to the list of anagrams
                anagrams[sorted_word].append(word)
            else:
                # If it's not, create a new key in the dictionary with the sorted word and the word as the value
                anagrams[sorted_word] = [word]
        
        # Return the values of the dictionary as a list of lists
        return list(anagrams.values())