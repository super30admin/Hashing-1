#Time Complexity: O(N * K * log(K))
#Space Complexity: O(N * K)



from typing import List

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
            # Create an empty dictionary to store anagrams
        anagram_groups = {}
    
        for word in strs:
        # Sort the characters in the word and use it as a key to group anagrams
            sorted_word = ''.join(sorted(word))
        
            if sorted_word in anagram_groups:
            # If the sorted word is already a key, append the original word to its list
                anagram_groups[sorted_word].append(word)
            else:
            # Otherwise, create a new entry in the dictionary with the sorted word as the key
                anagram_groups[sorted_word] = [word]

    # Convert the values of the dictionary into a list of grouped anagrams
        result = list(anagram_groups.values())

        return result




        
        