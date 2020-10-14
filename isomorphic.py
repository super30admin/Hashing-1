# Using hashing
# traverse the input and the output string simultaneously.
# keep the track of characters in s and characters in t in a hash map.
# if the key for the current character in s is already present in the hash map, check if the current character is the corresponding target value in the dictionary for that key. 
# if the key is not present, add the sourcechar:targetchar
# Time complexity - O(n) # length of the string
# Space complexity - O(2n+2n) for hash maps. 
# Did this solution run on leetcode? - yes

from collections import defaultdict
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        mapChars = defaultdict()
        revMapChars = defaultdict()
        
        # O(n)
        for i in range(len(s)):
            if s[i] not in mapChars and t[i] not in revMapChars:
                mapChars[s[i]] = t[i]
                revMapChars[t[i]] = s[i]
            elif (s[i] in mapChars and t[i] != mapChars[s[i]]) or (t[i] in revMapChars and s[i] != revMapChars[t[i]]):
                return False
        
        return True