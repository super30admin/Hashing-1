"""
Problem 1:
Given an array of strings, group anagrams together.

Approach - we use a prime product of the word and calculate it for each word then group them in a hashmap

Time - O(n)
Space - O(n)

"""

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        char_to_primes = {
            'a': 2,
            'b': 3,
            'c': 5,
            'd': 7,
            'e': 11,
            'f': 13,
            'g': 17,
            'h': 19,
            'i': 23,
            'j': 29,
            'k': 31,
            'l': 37,
            'm': 41,
            'n': 43,
            'o': 47,
            'p': 53,
            'q': 59,
            'r': 61,
            's': 67,
            't': 71,
            'u': 73,
            'v': 79,
            'w': 83,
            'x': 89,
            'y': 97,
            'z': 101
        }

        prod_to_groups = {}

        for word in strs:
            prod = 1
            for c in word:
                prod *= char_to_primes[c]
            
            if prod in prod_to_groups:
                prod_to_groups[prod].append(word)
            else:
                prod_to_groups[prod] = [word]
        
        return [group for group in prod_to_groups.values()]
    
    
