"""
    Explanation: I used a hashmap such that the characters are the keys and the number of occurances of the characters are the values for those keys
    Firstly, we know that every anagram sorted will be the same string, hence we join the charcters to compare with the keys
    If found, we append the string to the same key since its an anagram, else we don't append
    Time Complexcity: O(m*n log n)
    Space Complexcity: O(n)
"""


class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        str_dict = {}

        for strings in strs:
            sorted_string = ''.join(sorted(strings))

            if(sorted_string not in str_dict):
                str_dict[sorted_string] = []

            str_dict[sorted_string].append(strings)

        return str_dict.values()