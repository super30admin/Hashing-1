class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashmap ={}
        for word in strs:
            pp=self.primeproduct(word)
            if pp in hashmap.keys():
                hashmap[pp].append(word)
            else:
                hashmap[pp]=[]
                hashmap[pp].append(word)
        return hashmap.values()
    def primeproduct(self, word:str)->int:
        product=1
        primeValues=[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101]
        for i in range(len(word)):
            product=product*primeValues[ord(word[i])-ord('a')]
        return product