# T.c -> O(n)
# S.c -> O(n)
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        hashMap= {}
        smap= {}
        sArray= s.split(' ')
        if len(sArray)!= len(pattern):
            return False


        for i in range(len(pattern)):
            char= pattern[i]
            sString= sArray[i]
            if char in hashMap.keys():
                if hashMap[char] != sString:
                    return False
            else:
                hashMap[char]= sString
            
            if sString in smap.keys():
                if smap[sString]!= char:
                    return False
            else:
                smap[sString]= char

        return True

