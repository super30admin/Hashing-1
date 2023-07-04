#  Method 1 - 2 hashmaps
# Time complexity - O(n), since we need to iterate over each character.
# Space Complexity - O(1)
# We use a hashmap (search is O(1)) and map, s to t and also another one for t to s.
# If s-charachter isn't in s-map, store s-charachter as key and correspoding t-character as value.
# If present check if it's equal to current, t-charachter. If not, return False.
# Do the same with t-charachters

#  Method 2 - 1 hashmap and 1 set
# Time complexity - O(n), since we need to iterate over each character. 
# Space Complexity - O(1)
# We use a hashmap to map s to t and hashset for t to s
# If s-charachter present check if it's equal to current, t-charachter. If not, return False.
# If s-charachter isn't in s-map, check if corresponding t-charachter is in t-set, if it it then it means t to s mapping is a breach, return False.
# If not in t-set, then add it and also add s-charachter to t-charachter in the s-map.

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if not s and not t: return True #if either one of them is empty, False
        if not s or not t: return False #if both are empty, True
        if len(s)!=len(t): #if len not equal, False
            return False

        # smap=dict()
        # tmap=dict()

        #Method 1 with 2 hashmaps
        # for s1,t1 in zip(s,t):
        #     if s1 not in smap:              #if not in dict, add it
        #         smap[s1]=t1
        #     elif smap[s1]!=t1:              # if it is, check if value is equal to other string's character
        #         return False
        #     if t1 not in tmap:
        #         tmap[t1]=s1
        #     elif tmap[t1]!=s1:
        #         return False

        # return True



        #Method 2 with hashmap and hashset    
        smap=dict()
        tset=set()

        for i in range(0,len(s)):
            if s[i] in smap:              # if s[i] in dict, check if value is equal to t[i]
                if smap[s[i]]!=t[i]:      
                    return False
            else:
                if t[i] in tset:          # if not in dict, check if t[i] in set
                    return False
                smap[s[i]]=t[i]           # if not in dict, add to dict and set
                tset.add(t[i])
        return True

