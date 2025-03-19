# In this case we keep the mapping from s to t inside a hashmap.If there is any new different mapping we return False
# If mapping is correct is ok but if the t is present in the hashset then mapping from t to s is wrong so we return False
# Else we return True.
# Time Complexity = O(n)
# Space Complexity = O(1)

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        hashmap = {}
        hashset = set()
        for i in range(0,len(s)):

            if s[i] in hashmap.keys():
                if t[i]!=hashmap[s[i]]:
                    return False
            else:
                if t[i] in hashset:
                    return False 
                hashmap[s[i]]=t[i]
                hashset.add(t[i])
        return True


        