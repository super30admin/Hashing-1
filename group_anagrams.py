"""
Approach:
-> Create a hash value for each string in the list of strings using prime numbers.
-> Use a dictionary to group the strings based on their hash values.
-> Return the values of the dictionary as a list of lists.

e.g. strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
- "eat" -> hash_value = 2 * 11 * 19 = 418
- "tea" -> hash_value = 19 * 11 * 2 = 418
- "tan" -> hash_value = 19 * 2 * 13 = 494

-> Hashmap will look like:
{
    418: ["eat", "tea", "ate"],
    494: ["tan", "nat"],
    22: ["bat"]
}
-> we return the values of the hashmap as a list of lists.

Time Complexity:
O(N * K) where N is the number of strings in the input list and K is the maximum length of a string in the input list.

Space Complexity:
O(N*K) where N is the number of strings in the input list and K is the maximum length of a string in the input list.
"""
from ast import List


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        d = defaultdict(list)
        for str_ in strs:
            hash_value = self.getHash(str_)
            d[hash_value].append(str_)
        return list(d.values())

    
    def getHash(self, str_: str) -> float:
        prime= [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        
        hash_value = 1
        for char in str_:
            hash_value = hash_value * prime[ord(char) - ord('a')]
        return hash_value