class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if strs == None or len(strs)==0:
            return []
        hashMap ={}
        for string in strs:
            primeProduct =self.getPrimeProduct(string)
            if hashMap.get(primeProduct) == None:
                hashMap[primeProduct] = []
            hashMap[primeProduct].append(string)

        return hashMap.values()

    def getPrimeProduct(self , s:string) -> float:
        primes = [ 2, 3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103];
        primeProduct = 1
        for i in range(len(s)):
             character = s[i]
             primeProduct = primeProduct * primes[ord(character)- ord('a')]
        return primeProduct