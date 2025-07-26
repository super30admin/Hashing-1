class Solution:
    def groupAnagrams(self, strs: list[str]) -> list[list[str]]:
        primeDict = {}

        for i in range(len(strs)):
            word = strs[i]
            primeProduct = self.primeProduct(word)

            if primeProduct not in primeDict:
                primeDict[primeProduct] = []
            primeDict[primeProduct].append(word)
            
        return list(primeDict.values())


    def primeProduct(self, word: str) -> int:
        prime26 = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        product = 1
        for i in range(len(word)):
            c = word[i]

            product *= prime26[ord(c)-97] # take ord(a) or take 97
        return product