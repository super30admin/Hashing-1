#time - o(nk)
#space -- o(nk) k-avg length of string

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        map1 = {}
        for astr in strs:
            primeproduct = self.primeproduct(astr)
            if primeproduct not in map1:
               map1[primeproduct] = []
            map1[primeproduct].append(astr)
        return list(map1.values())

    def primeproduct(self, s:str) -> int:
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        result = 1
        for i in range(len(s)):
            c=s[i]
            result = result * primes[ord(c)- ord('a')]
        return result