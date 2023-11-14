class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if s==None or t==None:
            return False
        elif len(s)!=len(t):
            return False
        else:
            dic1={}
            set1=set()

            lis1=list(s)
            lis2=list(t)
            for i in range(0,len(s)):
                if lis1[i] in dic1:
                    if dic1[lis1[i]]!=lis2[i]:
                        return False
                else:
                    if lis2[i] in set1:
                        return False
                    else:
                        set1.add(lis2[i])
                        dic1[lis1[i]]=lis2[i]
            print(dic1)
            return True





        