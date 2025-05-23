"""
I used the same technique as in Problem 2, but before using the hash maps, I first split the string into words and stored them in an array so that each word is an individual element.
Time Complexity: O(n)
Space Complexity: O(1) only ASCII characters
"""
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split()
        if len(pattern) != len(words):
            return False
        hashMap1 = {}
        hashMap2 = {}
        for firstChar, secondChar in zip(pattern, words):
            if firstChar not in hashMap1:
                hashMap1[firstChar] = secondChar
            else:
                if hashMap1[firstChar] != secondChar:      
                    return False
            if secondChar not in hashMap2:
                hashMap2[secondChar] = firstChar
            else:
                if hashMap2[secondChar] != firstChar:
                    return False
        return True  
