class Solution:
    
    def primeProduct(self,str) -> int:
        prod=1
        prime=[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        for i in str:
            prod=prod*prime[ord(i) - ord('a')]
        return prod

    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashMap=dict()

        for i in strs:
            print(i)
            pp=self.primeProduct(i)
            if(hashMap.get(pp,0)==0):               
                hashMap[pp]=[i]
            else:

                hashMap[pp].append(i)

        return hashMap.values()

