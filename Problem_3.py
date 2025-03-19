# In this case we keep the mapping from s to t inside a hashmap.If there is any new different mapping we return False
# If mapping is correct is ok but if the t is present in the hashset then mapping from t to s is wrong so we return False
# Else we return True.
# Time Complexity = O(n)
# Space Complexity = O(1)

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        hashmap = {}
        hashset = set()
        words = s.split(" ")
        if len(pattern)!= len(words):
            return False
        for i in range(0,len(pattern)):
            if pattern[i] in hashmap.keys():
                if words[i]!=hashmap[pattern[i]]:
                    return False
                
            else:
                if words[i] in hashset:
                    return False
                else:
                    hashmap[pattern[i]]=words[i]
                    hashset.add(words[i])
        return True


        