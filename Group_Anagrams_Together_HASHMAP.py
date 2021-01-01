# Created by Aashish Adhikari at 6:50 PM 12/30/2020

'''
Time Complexity:
If the number if words is n and the average length of each word is k, O( n . k)

Space Complexity:



'''

class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """

        hashmap = {}

        prime_factors = [2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103]

        for word in strs:

            unique_anagram_sum = 1.

            for letter in word:


                unique_prime_factor_for_this_letter = ord(letter) - ord("a") # since a is the minimum ascii possible here

                unique_anagram_sum = unique_anagram_sum * prime_factors[unique_prime_factor_for_this_letter]

            if unique_anagram_sum in hashmap:
                hashmap[unique_anagram_sum].append(word)
            else:
                hashmap[unique_anagram_sum] = [word]

        list_of_lists = []
        for entry in hashmap:
            list_of_lists.append(hashmap[entry])

        return list_of_lists