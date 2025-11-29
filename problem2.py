class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        dict1={}
        hset=set()
        for i in range(len(s)):
            # Map for s->t and set for marking visited char in t
            if s[i] not in dict1:
                # check if s is not in map but t already mapped to another s
                if t[i] in hset:
                    return False
                # Add the mapping s->t and add the t char to hashset    
                else:
                    hset.add(t[i])
                    dict1[s[i]]=t[i]
            else:
                # have to match as it is already in map
                if dict1[s[i]]!=t[i]:
                    return False
        return True
        