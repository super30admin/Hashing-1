#Time Complexity : O(n)
# Space Complexity : O(1) since we have only 26 charcters max in hash map we have 26 keys. so space complexity is O(1).
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach in three sentences only

class Solution:

    """s = e g g
           t = a d d
        
            Now isomorphic basically means that characters in s can be replaced to get t.
            for example e -> a, g -> d, g -> d this gives add which is string t.
            second example s = "paper", t = "title"
            p -> t, a -> i, p -> t, e -> l, r -> e => title
            t -> p, i -> a, t -> p, l ->e, e -> r => papper
        
            so basically we are mapping each character in s to characterin t preserving the order of the characters.
            hashmap should help here, since we need a mapping of charcter,
            so lets say I have a hash map. now I iterate over the length of the string s and t either of them, both should be same.
            Now I map charcter at index i in s to charcter at index i in t. and before I map, I check if the character already exist in the hash map. if it exists in the hashmap then i check if value of the key is equal to the charcter at same index i in t.
            so code should be like this
            s = "egg", t = "add"
            initially I have an empty dictionary
            i itertae over lenght of s which is 3, indices from 0 -> 2
            I will first check if the s[i] exists in the hashmap, if it does not exist add it to the hashmap where key is s[i] and value is t[i] -> {s[i]: t[i]}
            if it already exists then check if value of s[i] is mapped to t[i], if not return False since s and t are not isomorphic.
            similarly we will also need to have an other hash map to check mapping from t -> s."""

    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t): return False
        hash_map_s = {}
        hash_map_t = {}
        for i in range(len(s)):
            if s[i] in hash_map_s:
                if hash_map_s[s[i]] != t[i]:
                    return False
            else:
                hash_map_s[s[i]] = t[i]
            
            if t[i] in hash_map_t:
                if hash_map_t[t[i]] != s[i]:
                    return False
            else:
                hash_map_t[t[i]] = s[i]
        return True