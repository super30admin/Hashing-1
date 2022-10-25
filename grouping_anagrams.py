# Time Complexity : O(nklog(n))
# Space Complexity : O(nk)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english: Use hashmap/dict to store the key of sorted words and map the words which contain the characters from the key

# Your code here along with comments explaining your approach


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        anagram_dict = dict()
        
        for i in strs:
            sorted_string = "".join(sorted(i))
            
            if sorted_string not in anagram_dict:
                anagram_dict[sorted_string] = []
                
            anagram_dict[sorted_string].append(i)
            
        return list(anagram_dict.values())
                
                
        