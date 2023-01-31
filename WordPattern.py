#All test cases passed on leetocde 

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:

        # Here we iterate through words of s and characters of pattern and store their mapping in dictionary. 
        # If current word in s is present in s dictionary mapping or vice versa then it should match with its 
        # exitsting matches present in s dictionary or pattern dictionary. If it doesnt match then we return False
        # Time complexity - O(n) where n is length of words of s or length of pattern string
        # Space complexity - O(n) because in dictionary we store words of s
        s = s.split()
        if len(s)!=len(pattern):
            return False

        sdict = {}
        patterndict = {}

        for i in range(len(s)):
            if s[i] in sdict:
                if sdict[s[i]]!=pattern[i]:
                    return False

            elif pattern[i] in patterndict:
                if patterndict[pattern[i]]!=s[i]:
                    return False

            else:
                sdict[s[i]] = pattern[i]
                patterndict[pattern[i]] = s[i]

        return True