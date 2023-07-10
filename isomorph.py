# // Time Complexity : O(N) N= number of characters.
# // Space Complexity : O(N) Hash can grow to N in worst case.
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this :


# // Your code here along with comments explaining your approach
# 1) two hashes are used, one to map s->t and another to map t->s
# 2) if the key is not initilized in both then initialize it.
# 3) if even one of them was already mapped then double mapping is checked
# 4) return flase if the same value as the current character is not found.
# 5) else return True

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
       
        h={}
        h_sec={}
        for i in range(len(s)):
            h[s[i]]=h.get(s[i],None)
            h_sec[t[i]]=h_sec.get(t[i],None)
            if(h[s[i]]==None and h_sec[t[i]]==None):
                h[s[i]]=t[i]
                h_sec[t[i]]=s[i]
            else:
                if(h[s[i]]!=t[i] and h_sec[t[i]]!=s[i]):
                    return False
        return True


