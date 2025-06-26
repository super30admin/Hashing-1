class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        return Counter(s) == Counter(t)
        

        # from collections import Counter
        # return Counter(s) == Counter(t)
        
        if len(s) != len(t): return False
        
        s = list(s)
        t = list(t)
        s.sort()
        t.sort()

        if s == t: return True
        return False
