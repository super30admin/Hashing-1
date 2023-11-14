class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        lis2=s.split(" ")
        if len(pattern)!=len(lis2):
            return False
        lis1=list(pattern)
        dic1={}
        s=set()

        for i in range(0,len(lis1)):
            if (lis1[i] not in dic1):
                if (lis2[i] in s):
                    return False
                dic1[lis1[i]]=lis2[i]
                s.add(lis2[i])
            else:
                if (lis2[i] not in s) or (dic1[lis1[i]]!=lis2[i]):
                    return False
        return True
                


        
        
        