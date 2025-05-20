"""
Problem 2:
find if given strings are isomorphic return true if it is or return false

Approach - I'm using 1 hashmap 1 set approach
-> check if char exist in the hashmap if it does compare it with the value/mapping
and that is compared to char from second string if not equal we return false
-> if char does not exist in hashmap then we check if second char from string t is in set if it is then 
we reach breaking point  
-> if both of these conditions don't meet then we just map it to hashmap and in set

Time - O(n)
Space - O(n)

"""

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        hashmap = {}
        mapped_chars = set()

        for i in range(len(s)):
            char_s = s[i]
            char_t = t[i]

            if char_s in hashmap:
                if hashmap[char_s] != char_t:
                    return False
            else:
                if char_t in mapped_chars:
                    return False
                hashmap[char_s] = char_t
                mapped_chars.add(char_t)

        return True

        