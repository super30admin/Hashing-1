"""
I implemented the solution by sorting each word and using the sorted string as a key in a dictionary. This allows all anagrams to be grouped under the same key. The grouped values are then returned as the final result.
Time Complexity: O(n × k log k)
Space Complexity: O(n × k)
"""
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagram_dict = dict()
        for word in strs:
            sorted_str = "".join(sorted(word))
            if sorted_str not in anagram_dict:
                anagram_dict[sorted_str] = []
            anagram_dict[sorted_str].append(word)
            
        return list(anagram_dict.values())
        