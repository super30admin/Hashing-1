"""
Time Complexity: O(n)

Space Complexity: O(n)

"""
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        
        patten, s = list(pattern), s.split(" ")
        if len(pattern) != len(s): return False
        mp1 = {}
        mp2 = set()

        for a, b in zip(pattern, s): 
            if a in mp1: 
                if mp1[a] != b: 
                    return False
            else:
                if b not in mp2: 
                    mp1[a] = b
                    mp2.add(b)
                else: 
                    return False
        return True




