# Solution 1
# Using prime products
# Steps:
# Create a list of first 27 prime numbers. (a-2, b-3, c-5, .., z- 97)
# Traverse the strings array.
# For each string, calculate it's prime product and add the new string in the list corresponding to the key equal to the value of the prime product.
# Return the list of list strings as result.
# Time complexity - O(n*m) where n is the number of strings, m is the max length of the string.
# Space complexity - O(nm)
# Did this solution run on leetcode? - yes
from collections import defaultdict
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        anagram_dict = defaultdict(lambda: [])
        for s in strs:
            pp = 1
            for ch in s:
                pp *= primes[ord(ch)-97]
            anagram_dict[pp].append(s)
        
        return anagram_dict.values()   

# Solution 2
# Using sorting
# Traverse every string in the strings list.
# Sort the string which will be the key for the anagram dict.
# Keep adding the values to the list corresponding to the sorted key.
# Return the list of list strings as result.
# Time complexity - O(n*m*logm) where n is the number of strings, m is the max length of the string.
# Space complexity - O(nm)
# Did this solution run on leetcode? - yes
from collections import defaultdict
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagram_dict = defaultdict(lambda: [])
        for s in strs:                                          # O(n)
            sstr = ''.join(sorted(s))                           # O(m*logm)
            anagram_dict[sstr].append(s)                        # O(m)
        
        return anagram_dict.values()       # O(n)

# Solution - 3
# Keep a hash map where counts of alphabets in the string is a key and the value is the string corresponding to it.
# match the counts of string already in the hash map with the counts of current string.
# if the two match, append the string to that key.
# else, create a new key and append the string to it.
# Time complexity - O(nm) where n is the length of strings list, m is the length of each string.
# Space complexity - O(nm)
# Did this solution run on leetcode? - yes
from collections import defaultdict
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagram_dict = defaultdict(lambda: [])
        for s in strs:
            count = [0] * 26
            for ch in s:
                count[ord(ch)-97] += 1
            anagram_dict[tuple(count)].append(s)
        return anagram_dict.values()
    