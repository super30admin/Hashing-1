# Time Complexity :  O(n) number of characters in string
# Space Complexity : O(1) because max number of characters in map will be constant
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        hashmap = {}
        hashset = set()
        for i in range(len(s)):
            if s[i] not in hashmap: 
                if t[i] not in hashset:
                    hashset.add(t[i])
                else:
                    return False
                hashmap[s[i]] = t[i]
            else:
                if hashmap[s[i]] != t[i]:
                    return False
        return True