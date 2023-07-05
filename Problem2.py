# Time complexity : O(n)
# Space Complexity : O(n)

# I have used 2 Hash Maps for this solution. One stores key and mapping for s string and another t string.
# I am checking if the value exists in s before adding to dictionary for s. If exists, I will check if it is equal to index at t.
# Similarly for t dictionary

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        elif len(s)==0 and len(t)==0:
            return True
        
        s_dict={}
        t_dict={}
        for i in range(0,len(s)):
            if s_dict.get(s[i]) is None:
                s_dict[s[i]]=t[i]
                valueAtT = t_dict.get(t[i])
                if valueAtT is None:
                    t_dict[t[i]]=s[i] 
                else:
                    if valueAtT != s[i]:
                        return False
            else:
                if s_dict[s[i]] != t[i]:
                    return False
        return True

                    