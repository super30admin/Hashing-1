# Time Complexity : O(n)
# Space Complexity : O(n)

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t): #check if both the strings are of same length
            return False
        
        hash_map = {} # To map s characters to t characters
        hash_set = set() # To keep track of mapped t characters
        
        for i in range(len(s)):
            if s[i] in hash_map:
                if hash_map[s[i]] != t[i]:
                    return False
            else:
                if t[i] in hash_set:
                    return False
                hash_map[s[i]] = t[i]
                hash_set.add(t[i])
        
        return True
