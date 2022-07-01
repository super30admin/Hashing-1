'''

## Problem 205: Isomorphic strings

## Author: Neha Doiphode
## Date:   06-27-2022

## Description:
   Given two strings s and t, determine if they are isomorphic.
   Two strings s and t are isomorphic if the characters in s can be replaced to get t.
   All occurrences of a character must be replaced with another character while preserving the order of characters.
   No two characters may map to the same character, but a character may map to itself.


## Examples
    Example 1:
        Input: s = "egg", t = "add"
        Output: true

    Example 2:
        Input: s = "foo", t = "bar"
        Output: false

    Example 3:
        Input: s = "paper", t = "title"
        Output: true

    Example 4:
        Input: s = abcd , t = abab
        Output: false

## Constraints:
    1 <= s.length <= 5 * 104
    t.length == s.length
    s and t consist of any valid ascii character.

## Approaches:
    * Approach 1: Use 2 hash maps.(TC: O(n), SC: O(1))
    * Approach 2: Use 1 hash map, 1 hash set. (TC: O(n), SC: O(1))
    * Approach 3: Use index based mapping.(TC: O(n), SC: O(n))
    * Approach 4: Use character arrays using hash function. Hash function should be [ord(sChar) - ord(' ')(space)]
                  sChar -> tChar(array 1)
                  tChar -> sChar(array 2) (TC: O(n), SC: O(1))

## Time complexity: Please refer to doc-string of functions below.

## Space complexity: Please refer to doc_string of functions below.

'''

def get_input():
    print(f"Enter string 1(s): ", end = '')
    s_str = input()

    print(f"Enter string 2(t): ", end = '')
    t_str = input()

    return s_str, t_str

class Solution:
    def isIsomorphic_using_two_hashmaps(self, s: str, t: str) -> bool:
        '''
        Time complexity: O(n), as we have to traverse through the string once to check every single character.

        Space complexity: O(1), since we are working over fixted number of set of characters which is 26.
                                   so the hash map is going to at the max can have fixed number of valid characters.
        '''
        # Check lengths of two strings
        if len(s) != len(t):
            return False

        s_map = {}
        t_map = {}

        for s_char, t_char in zip(s, t):
            if s_char not in s_map:
                s_map[s_char] = t_char
            elif s_map[s_char] != t_char:
                    return False

            if t_char not in t_map:
                t_map[t_char] = s_char
            elif t_map[t_char] != s_char:
                    return False
        return True


    def transform_into_index_map(self, temp):
        new_str = []
        index_mapping = {}

        for index, char in enumerate(temp):
            if char not in index_mapping:
                index_mapping[char] = index
            new_str.append(str(index_mapping[char]))
        return " ".join(new_str)

    def isIsomorphic_using_index_mapping(self, s: str, t:str) -> bool:
        '''
        Time complexity: O(n), as we have to traverse through the string once to check every single character.

        Space complexity: O(n), as we store auxiliary transformed strings.
        '''
        # Check lengths of two strings
        if len(s) != len(t):
            return False
        if self.transform_into_index_map(s) != self.transform_into_index_map(t):
            return False
        return True

    def isIsomorphic_using_hashmap_and_hashset(self, s: str, t:str) -> bool:
        '''
        Time complexity: O(n), as we have to traverse through the string once to check every single character.

        Space complexity: O(1), since we are working over fixted number of set of characters which is 26.
                                   so the hash map is going to at the max can have fixed number of valid characters.
        '''
        # Check lengths of two strings
        if len(s) != len(t):
            return False

        s_map = {}
        t_set = set()

        for s_char, t_char in zip(s, t):
            if s_char in s_map:
                if s_map[s_char] != t_char:
                    return False
            else:
                s_map[s_char] = t_char
                if t_char in t_set:
                    return False
                t_set.add(t_char)
        return True

    def isIsomorphic_using_character_arrays(self, s: str, t:str) -> bool:
        '''
        Time complexity: O(n), as we have to traverse through the string once to check every single character.

        Space complexity: O(1), since we are working over fixted number of set of characters which is 26.
                                   so the hash map is going to at the max can have fixed number of valid characters.
        '''
        # Check lengths of two strings
        if len(s) != len(t):
            return False

        # Array lengths are considered 256 to account for all valid ascii characters.
        s_array = [None] * 256
        t_array = [None] * 256

        for s_char, t_char in zip(s, t):
            if s_array[ord(s_char) - ord(' ')] and s_array[ord(s_char) - ord(' ')] != t_char:
                return False
            else:
                s_array[ord(s_char) - ord(' ')] = t_char
                if t_array[ord(t_char) - ord(' ')] and t_array[ord(t_char) - ord(' ')] != s_char:
                    return False
                t_array[ord(t_char) - ord(' ')] = s_char
        return True

# Driver code
s_str, t_str = get_input()
solution = Solution()
print(f"Original strings: s-string = {s_str}, t-string = {t_str}")
print("Are they isomorphic?(Two strings s and t are isomorphic if the characters in s can be replaced to get t.)")
print(f"Result: Approach 1: Using two hash maps: {solution.isIsomorphic_using_two_hashmaps(s_str, t_str)}")
print(f"Result: Approach 2: Using index mapping: {solution.isIsomorphic_using_index_mapping(s_str, t_str)}")
print(f"Result: Approach 3: Using one hash map and one hash set: {solution.isIsomorphic_using_hashmap_and_hashset(s_str, t_str)}")
print(f"Result: Approach 4: Using character arrays: {solution.isIsomorphic_using_character_arrays(s_str, t_str)}")
