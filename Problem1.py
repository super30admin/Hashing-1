'''
The aim is to create a key using the chars in the word such that the anagrams produce
same key.

There are multiple ways to create this key:
1. Take 26 prime numbers. Assign them to each char in alphabets. Multiply the primes corresponding to each character.
The result is a unique key for all the anagrams that can be formed using the chars of the word.
2. Create a string code where an alphabet in the word is followed by its count.
E.g. cat -> a1c1t1
     act -> a1c1t1

The alphabets in the code are sorted so the code remains same for anagrams.

Time complexity: O(n)
Space complexity: O(n)
'''
class Solution:
    def getKey(self, word):
        code = ''
        charCount = {}

        for s in word:
            if s not in charCount:
                charCount[s] = 0
            charCount[s] += 1

        for key in sorted(charCount.keys()):
            code += key + str(charCount[key])

        return code
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hMap = {}
        anagrams = []

        for word in strs:
            key = self.getKey(word)
            if key not in hMap:
                hMap[key] = []

            hMap[key].append(word)

        for key in hMap:
            anagrams.append(hMap[key])

        return anagrams