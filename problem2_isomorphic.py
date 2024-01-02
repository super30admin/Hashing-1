#time complexity : O(n) when n is the number of input string 
#space complexity: O(n), because here two dictionaries (mapS and mapT) are used to store the mapping of characters from string s to t and t to s
#Submit on leetcode : yes

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t): 
            return False
        if not s and not t:
            return False

        mapS, mapT = {}, {}

        for i in range(len(s)):
            charS, charT = s[i], t[i]

            if (charS in mapS and mapS[charS] != charT) or (charT in mapT and mapT[charT] != charS):
                return False

            mapS[charS] = charT
            mapT[charT] = charS

        return True


solution = Solution() 
s1 = "egg"
t1 = "add"
print(f"Isomorphic for '{s1}' and '{t1}': {solution.isIsomorphic(s1, t1)}")      
        