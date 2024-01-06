# https://leetcode.com/problems/group-anagrams/
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        output = []
        hashMap = dict()
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103]

        for i in strs:
            primeProduct = 1
            for j in i:
                primeProduct *= primes[ord(j)-ord('a')]
            if primeProduct in hashMap:
                hashMap[primeProduct].append(i)
            else:
                hashMap[primeProduct] = [i]
        return hashMap.values()

#time complexity O(n*m); n is total count of strings, m is length of each string
#space complexity O(1)
#consider a primes array where each element indicates a distinct prime number to an alphabet
#use a haspmap with keys as product of primes(since product of primes is unique for different combinations), values are strings with respective prime product present in key