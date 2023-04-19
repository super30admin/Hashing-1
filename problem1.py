"""
Time Complexity : O(nk)
Space Complexity : O(nk)
where n is the number of elements in strs and k is the average length of words in strs

Did this code successfully run on Leetcode : Yes

Your code here along with comments explaining your approach:
We will use the hashing techniqe used underhood in hashMap to store the strings. Every alphabet is assigned to the prime number and then then the hash value is calulated as the product of ascii value and the prime number assigned to it. 
For example: "ad" = 96 * 2 + 99 * 5
This reduces the collision.

Approach for this problem:
1. Take the prime product of the letters in the word and the words having matching prime products are the anagrams 

"""
class Solution:
    def primeProduct(self, s):
        primeProduct = 1
        primes = [2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103]
        for letter in s:
            primeProduct *= primes[(ord(letter) - ord('a'))]
        return primeProduct
    
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        #Time Complexity: O(nk)
        #Space Complexity: O(nk)
        #where n is the number of elements in the strs and k is the average length of words in strs
        result = []
        hashMap = {}
        for word in strs:
            primeProduct = self.primeProduct(word)
            if primeProduct not in hashMap:
                hashMap[primeProduct] = []
            hashMap[primeProduct].append(word)
        
        for val in hashMap.values():
            result.append(val)
        
        return result