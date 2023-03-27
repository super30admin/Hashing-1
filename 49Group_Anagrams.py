#Time Complexity: hash function based on prime numbers is O(n * m), 
# where n is the number of words in the input list and m is the length of the longest word in the list.

#Space Complexity: O(n * m), since in the worst case, each word in the input list may be a unique anagram

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if not strs or len(strs) == 0:
            return []
        
        hashmap = {}
        
        for string in strs:
            key = self.primeproduct(string)
            if key in hashmap:
                hashmap[key].append(string)
            else:
                hashmap[key] = [string]
        
        return hashmap.values()
        
        
    def primeproduct(self, string:str) -> int:
        prime_nos = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199]
        product = 1
        for char in range(len(string)):
            character = string[char]
            product = product * prime_nos[ord(character) - ord('a')]
        
        return product
        

