class Solution(object):
    def primeProduct(self, listPrimes, string):
        # Calculating the product of prime numbers corresponding to the characters in the string
        product = 1
        for char in string:
            product *= listPrimes[ord(char) - ord('a')]
        return product

    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        # List of prime numbers for 26 alphabets
        listPrimes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83,
                      89, 97, 101, 103]

        anagramList = {}  # Dictionary to store anagrams

        for string in strs:
            # Calculating the prime product of the string
            primeProduct = self.primeProduct(listPrimes, string)

            if primeProduct in anagramList:
                # Adding the string to the corresponding anagram list
                anagramList[primeProduct].append(string)
            else:
                # Initializing a new anagram list with the prime product as key
                anagramList[primeProduct] = [string]

        listStrings = []

        for key in anagramList:
            # Appending the anagram lists to the final list
            listStrings.append(anagramList[key])

        return listStrings
