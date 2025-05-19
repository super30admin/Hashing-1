""" 
Check how each character in s maps to a character in t and t to s
If a mapping is inconsistent or reused, return False
If it passes all checks, return True
"""
"""
Time Complexity:
O(n) —  n is the length of the strings
Space Complexity: 
O(1) — constant space for mapping characters  
"""
class ispmorphic:
    def isIsomorphic(self, s: str, t: str) -> bool:
        s_map, t_map = {}, {}
        for a, b in zip(s, t):
            if s_map.get(a, b) != b or t_map.get(b, a) != a:
                return False
            s_map[a] = b
            t_map[b] = a
        return True
    
if __name__=="__main__":
    obj = ispmorphic()
    s = "foo"
    t = "bar"
    print(obj.isIsomorphic(s,t))