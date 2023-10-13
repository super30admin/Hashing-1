#TC: O(N)
#SC: O(1)
class Solutions:
    def isIsomorphic(s:str,t:str)->bool:
        d ={}
        for indx in range(len(s)):
            char1, char2 = s[indx], t[indx]
            
            if char1 not in d:
                if char2 in d.values():
                    return False
                
                d[char1]=char2
            elif d[char1] != char2:
                return False
        return True
            
print(Solutions.isIsomorphic("add","egg"))
