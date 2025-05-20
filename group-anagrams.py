"""
This solution uses a hash map to group anagrams together. 
It sorts each string and uses it as a key in the hash map. 
The value is a list of strings that are anagrams of each other.
"""

# Time Complexity : O(n * k) where n is the number of strings and k is the maximum length of a string (calculating the product of primes takes k time)
# Space Complexity : O(n) because the hash map will have n prime products as keys
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # Assign a unique prime to each lowercase letter
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        anagrams = {}

        for s in strs:
            product = 1
            for char in s:
                product *= primes[ord(char) - ord('a')]
            if product in anagrams:
                anagrams[product].append(s)
            else:
                anagrams[product] = [s]

        return list(anagrams.values())
        