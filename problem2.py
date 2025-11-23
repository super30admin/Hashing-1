"""
We map each caracter of s to t and vice versa, i.e. we store two maps, and the moment we find a mismatch in their mappings, we return false
else we add it to the map and continue
Since we know we have to build two map space would be o(52) which is O(1) and tc would be o(n) as well for traversing.
"""
class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        mapS, mapT = {}, {} #create two maps for each string

        for i in range(len(s)):
            c1, c2 = s[i], t[i] #get the characters

            if ((c1 in mapS and mapS[c1] != c2) or #if character is present in the map and it doesnt match to the other character as key
                (c2 in mapT and mapT[c2] != c1)):
                return False #its not matching (isomorphic condition fails)
            mapS[c1] = c2
            mapT[c2] = c1 #else, add it to the map at that particular key
        return True
