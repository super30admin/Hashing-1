"""
Take each word and sort its characters to get a key (anagrams would same sorted key).
Group words by their sorted key in a hashmap.
Extract and return grouped anagram lists from the values in the hashmap.
"""
"""
Time Complexity:
O(N*MlogM) - where N =is number of words, M = length of each word and sorting involved.
Space Complexity:
O(N*M) - For storing the grouped anagrams and result.
"""


from collections import defaultdict
class groupAnagram:
    def groupAnagrams(self, strs: list[str]) -> list[list[str]]:

        check = defaultdict(list)

        for word in strs:
            w_sorted = ''.join(sorted(word))
            check[w_sorted].append(word)
        return list(check.values())
    
if __name__=="__main__":
    obj = groupAnagram()
    strs = ["eat","tea","tan","ate","nat","bat"]
    print(obj.groupAnagrams(strs))

        