from tokenize import String

class Solution:
    def groupAnagrams(self, strs: list[str]) -> list[list[str]]:
        if strs == None or len(strs) == 0:
            return []
        
        hashMap = {}
        for string in strs:
            primeProduct = self.getPrimeProduct(string)
            if hashMap.get(primeProduct) == None:
                hashMap[primeProduct] = []
            hashMap[primeProduct].append(string)
        return hashMap.values()
    
    def getPrimeProduct(self, s: String) -> float:
        primes = [2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103]
        primeProduct = 1
        
        for i in range(len(s)):
            character = s[i]
            primeProduct = primeProduct * primes[ord(character)-ord('a')]
        return primeProduct
    

#Time complexity ---> O(nk)
# n represents no.of words in array
#k represents no.of characters in each word

#Space complexity ----> O(1)