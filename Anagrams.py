# Time complexity: O(n * k * log(K)) where n is number of words in list and k is number of char in a word.
# Space Complexity: O(n) where n is the number of keys stores in the HashMap
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : No


# Time complexity: O(n * k) n is each word and k is each char in the word
# Space Complexity: O(n) where n is the number of keys stores in the HashMap
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : No


class Solution:

    # Simple Hash Method
    # For each word we will sort the word
    # create a key in the dictionary with the sorted word, and will add that word to the value of that key
    # Words with the same chars will hash into same key and added to the list
    def groupAnagrams(self, strs: list[str]) -> list[list[str]]:

        HashMap = {}
        for word in strs:

            key = str(sorted(word))

            if key not in HashMap.keys():

                HashMap[key] = [word]

            else:

                HashMap[key].append(word)

        output = []
        for key, values in HashMap.items():
            output.append(values)

        return output

    # using PrimeHash method

    # here instead of sorting and creating the key,  we will allocate a prime number for each word we will multiply
    # all the char's corresponding prime numbers and the value will be unique for those chars in a string and it will
    # become the key

    def groupAnagrams2(self, strs: list[str]) -> list[list[str]]:

        primeNumbers = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,
                        101]

        HashMap = {}

        for word in strs:

            key = self.primeHash(word, primeNumbers)

            if key not in HashMap.keys():

                HashMap[key] = [word]

            else:

                HashMap[key].append(word)

        output = []
        for key, values in HashMap.items():
            output.append(values)

        return output

    def primeHash(self, word, primeNumbers) -> int:

        value = 1

        for char in word:
            c = ord(str(char))

            value = value * primeNumbers[c - ord('a')]

        return value
