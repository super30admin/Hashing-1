class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        
        #Using 2 hashmaps
        sMap = {}
        tMap = {}
        for i in range(len(s)):
            sChar = s[i]
            tChar = t[i]
            
            if sMap.get(sChar) != None:
                if sMap[sChar] != tChar:
                    return False
            else:
                sMap[sChar] = tChar
            
            if tMap.get(tChar) != None:
                if tMap[tChar] != sChar:
                    return False
            else:
                tMap[tChar] = sChar
        return True
        
        #Using 1 Hashmap and 1 Hashset
        sMap = {}
        tSet = set()
        for i in range(len(s)):
            sChar = s[i]
            tChar = t[i]
            
            if sMap.get(sChar) != None:
                if sMap[sChar] != tChar:
                    return False
            else:
                if tChar in tSet:
                    return False
                sMap[sChar] = tChar
                tSet.add(tChar)
            return True
        
#Time complexity ---> O(n)   
#Space complexity ----> O(1)
        
        
        
    