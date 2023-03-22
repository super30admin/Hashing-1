# T.c-> O(n*k)
# S.c-> O(n)
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # Using the concept of PRODUCT OF PRIME NUMBERS.

        hashMap= {}
        for string in strs:
            primeProduct= self.get_primeProduct(string)

            if primeProduct in hashMap.keys():
                hashMap[primeProduct].append(string)
            else:
                hashMap[primeProduct]= [string]
        return hashMap.values()

    def get_primeProduct(self, string:str):
        primes= [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 
                43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103]
        primeProduct=1
        for letter in string:
            primeProduct= primeProduct * primes[ord(letter)- ord('a')]

        return primeProduct
