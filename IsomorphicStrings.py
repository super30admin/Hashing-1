## we will be using 2 data structures , a hashmap and a set. We will use a hashmap t map the characters of s with the corresponding characters of t
## if the character is already used(which is stored in visited set) and the the character from s is not in the mapper hashmap, 
## then we return false, else if the mapping is right we add the character in t to the visited
##if everything goes right, we come out of for lop and return true
## Time --> O(n) n--> len(string)
## space --> O(1) only 26 characters
class Solution:
    def isomorphic(self, s, t):

        mapper ={}
        visited = set()

        if s == t:
            return True

        if len(s)!= len(t):
            return False

        for i in range(len(s)):
            if s[i] not in mapper:
                if t[i] in visited:
                    return False
                else:
                    mapper[s[i]] = t[i]
                    visited.add(t[i])
        
            else:
                if mapper[s[i]] != t[i]:
                    return
        
        return True

