"""
Time Complexity : Inside program
Space Complexity : Inside program
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

Problem 1: Given an array of strings, group anagrams together.
Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"], ["nat","tan"], ["bat"]
]
Note:
All inputs will be in lowercase.
The order of your output does not matter
"""
# Approach - 1
import collections


class Solution:
    def groupAnagrams(self, strs): 
        """
        We will be using HashMap to store the words as in its sorted form as the key and the value w.r.t the key 
        will be the list of words with same char(sorted).
        Itype : list[str]
        rtype : list[str]
        Time Complexity :  O(N*K log K), N:length of strs, and K:maximum length of a string in strs
        Space Complexity    O(N*K)
        
        """

        #Edge Cases
        if strs == [""]:
            return [[""]]
        
        if len(strs) == 1:
            return [strs]
        #using defaultdict as it provides a default value for the key that does not exists.
        str_map = collections.defaultdict(list)

        for words in strs:
            # defaultdict keys are immutable, only tuple or str can be used
            str_map[tuple(sorted(words))].append(words)
        return str_map.values()
        
# Approach - 2

class Solution_1:
    def get_prime_product(self, word):
        """
        Helper function to calculate the product of the primes for each char in strs
        """
        char_prime = {'a': 2, 'b': 3, 'c': 5, 'd': 7, 'e': 11, 'f': 13,'g': 17,'h': 19,'i': 23, 'j': 29,  'k': 31,  'l': 37,  'm': 41,
                  'n': 43,'o': 47, 'p': 53,'q': 59,'r': 61, 's': 67, 't': 71,'u': 73,'v': 79,'w': 83,'x': 89, 'y': 97,'z': 101}
        prod = 1
        for char in word:
            prod = char_prime[char] * prod
        return prod

    def groupAnagrams(self, strs): 
        """
        We will be using HashMap to store the sum of predefined prime number w.r.t each char in strs .
        Itype : list[str]
        rtype : list[str]
        Time Complexity :  O(N*K), N:length of strs, and K:maximum length of a string in strs
        Space Complexity    O(N*K)
        
        """

        #Edge Cases
        if strs == [""]:
            return [[""]]
        
        if len(strs) == 1:
            return [strs]
        #using defaultdict as it provides a default value for the key that does not exists.
        str_map = collections.defaultdict(list)

        for word in strs:
            prod = self.get_prime_product(word)

            if not prod in str_map.keys():
                str_map[prod] = [word]
            else:
                str_map[prod].append(word)

        return str_map.values()


        

