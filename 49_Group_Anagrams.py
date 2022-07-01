'''

## Problem 49: Group Anagrams

## Author: Neha Doiphode
## Date:   06-28-2022

## Description:
    Given an array of strings strs, group the anagrams together.
    You can return the answer in any order.
    An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
    typically using all the original letters exactly once.

## Examples:
    Example 1:
        Input: strs = ["eat","tea","tan","ate","nat","bat"]
        Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

    Example 2:
        Input: strs = [""]
        Output: [[""]]

    Example 3:
        Input: strs = ["a"]
        Output: [["a"]]

## Constraints:
    1 <= strs.length <= 104
    0 <= strs[i].length <= 100
    strs[i] consists of lowercase English letters.

## Time complexity: Please refer to function doc-strings.

## Space complexity: Please refer to function doc-strings.
'''

from typing import List

def get_input():
    print("******* Group Anagrams *******")
    print("Enter the list of words with spaces: ", end = "")
    word_list = input()
    word_list = word_list.split()
    return word_list

class Solution:
    def groupAnagrams_with_sorting(self, strs: List[str]) -> List[List[str]]:
        '''
        Time complexity: O(nk log k), sorting of words with average length k would take (k logk) time asymptotic.
                                      And doing this on the list of "n" number of words would take O(nk log k).
        Space complexity: O(nk), where k is average length of each word and n is total number of words.
        '''
        look_up = {}
        result = []
        for s in strs:
            temp = "".join(sorted(s))
            if temp not in look_up:
                look_up[temp] = []
            look_up[temp].append(s)

        result = [value for key, value in look_up.items()]
        return result

    def get_product(self, s: str) -> int:
        look_up = {'a' : 2,  'b' : 3,   'c' : 5,
                   'd' : 7,  'e' : 11,  'f' : 13,
                   'g' : 17, 'h' : 19,  'i' : 23,
                   'j' : 29, 'k' : 31,  'l' : 37,
                   'm' : 41, 'n' : 43,  'o' : 47,
                   'p' : 53, 'q' : 59,  'r' : 61,
                   's' : 67, 't' : 71,  'u' : 73,
                   'v' : 79, 'w' : 83,  'x' : 89,
                   'y' : 97, 'z' : 101}

        product = 1
        for char in s:
            product *= look_up[char]
        return product

    def groupAnagrams_with_prime_numbers_product(self, strs: List[str]) -> List[List[str]]:
        '''
        Time complexity: O(nk), O(k) to find product of characters with string of average length k
                                product is computed for n such strings. Hence, O(nk).
        Space complexity: O(nk), space required to store prime numbers is not counted as it is fixed length array.
                                space required to store prime product map.
        '''
        prime_product_map = {}
        result = []
        for s in strs:
            product = self.get_product(s)
            if product not in prime_product_map:
                prime_product_map[product] = []
            prime_product_map[product].append(s)

        result = [value for key, value in prime_product_map.items()]
        return result

    def get_character_count(self, s: str) -> List[int]:
        char_counts = [0] * 26
        for char in s:
            char_counts[ord(char) - ord('a')] += 1
        return tuple(char_counts)

    def groupAnagrams_by_tracking_character_counts(self, strs: List[str]) -> List[List[str]]:
        '''
        Time complexity: O(nk), O(k), to compute character count in a string with average length k
                                count is computed for n such strings. Hence, O(nk).
        Space complexity: O(nk), space required to store character count map
        '''
        character_count_map = {}
        result = []
        for s in strs:
            character_count = self.get_character_count(s)
            if character_count not in character_count_map:
                character_count_map[character_count] = []
            character_count_map[character_count].append(s)

        result = [value for key, value in character_count_map.items()]
        return result



# Driver code
solution = Solution()
word_list = get_input()
result = solution.groupAnagrams_with_sorting(word_list)
print()
print()
print(f"Original input list: {word_list}")
print()
print(f"Anagram grouping: Approach 1: Using alphabetical sorting: {result}")
result = solution.groupAnagrams_with_prime_numbers_product(word_list)
print(f"Anagram grouping: Approach 2: Using prime number product: {result}")
result = solution.groupAnagrams_by_tracking_character_counts(word_list)
print(f"Anagram grouping: Approach 3: Using character counts: {result}")
