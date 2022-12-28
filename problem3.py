class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        from collections import Counter
        
        p = [val for val in Counter(pattern).values()]
        s = [val for val in Counter(s.split()).values()]

        return p == s