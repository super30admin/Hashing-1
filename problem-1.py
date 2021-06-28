#time-comp- O(n) as we are traversing at least once
#space comp- O(n) as we are taking two hash maps ? not sure why it should be O(1)
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        d1={} #dictionary to store key-value for s
        d2={} #dictionary to store key-val for t
        for i in range(0,len(s)):
            if s[i] not in d1:
                d1[s[i]]=t[i]
                if t[i] not in d2:
                    d2[t[i]]=s[i]
                else:
                    return False
            else:
                 if d1[s[i]]!=t[i]:
                        return False
        return True
            
