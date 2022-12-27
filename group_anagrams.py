# Time Complexity :
# O(N k log k)  - Length of the array strs,  k is length of the strings

# Space Complexity :
# O(nk) - the hasp map size has a max limit of 26

# Did this code successfully run on Leetcode :
#Yes

# Any problem you faced while coding this :
#No

#We sort all the words in the list. (O(N k log k))
#Sorted versions of different strings that are anagrams will be same and we add them in a hashmap
# We can go through the list of all the words and store he oens corresponding to the same sorted string in a hasmap as a value and key for this would be the sorted string itself. 
#Then the values of the haspmap is the result we want 

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        grouped_anagrams = []
        self.added_strs = {}
        if len(strs) == 0:
            grouped_anagrams.append([""])
            return grouped_anagrams
        sorted_char_list = []
        sorted_str_mapping = {}
        for i,input_str in enumerate(strs):
            #sorted_char_list.append()
            sorted_str = ''.join(sorted(input_str))
            if sorted_str in sorted_str_mapping:
                sorted_str_mapping[sorted_str].append(i)
            else :
                sorted_str_mapping[sorted_str] = [i]
        for key,value in sorted_str_mapping.items() :
            current_anagrams = [strs[string_pos] for string_pos in value]
            grouped_anagrams.append(current_anagrams)

        return grouped_anagrams
