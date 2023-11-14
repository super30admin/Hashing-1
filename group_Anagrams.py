class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dic1={}
        primelis=[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101]
        for i in range(0,len(strs)):
            lis=list(strs[i])
            prod=1
            print(lis)
            for j in range(0,len(lis)):
                prod=prod*(primelis[ord(lis[j])-ord('a')])
            if prod not in dic1:
                dic1[prod]=[]
                dic1[prod].append(strs[i])
            else:
                dic1[prod].append(strs[i])
        print(dic1)
        return dic1.values()





        
        