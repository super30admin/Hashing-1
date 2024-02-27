class GroupAnagrams(object):
    '''
    Solution:
    1. Group Anagrams using HashMap where key to a group would be prime product of characters in a string.
    2. Each Character in a string is mapped to a prime number.
    3. Strings with same prime product are grouped together.

    --- Passed all Leetcode testcases successfully
    '''

    def primeProduct(self, listPrimes, string):

        # O(k) Time Complexity | O(1) Space Complexity , k is the length of the string
        product = 1
        for char in string:
            product *= listPrimes[ord(char) - ord('a')]
        return product

    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """

        # O(nk) Time Compelxity | O(n) Space Complexity, n is number of strings and k is average length of each string.
        listPrimes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83,
                      89, 97, 101, 103]

        anagramGroups = {}

        for string in strs:
            primeProduct = self.primeProduct(listPrimes, string)
            if primeProduct in anagramGroups:
                anagramGroups[primeProduct].append(string)
            else:
                anagramGroups[primeProduct] = [string]

        listStrings = []
        for key in anagramGroups:
            listStrings.append(anagramGroups[key])
        return listStrings

