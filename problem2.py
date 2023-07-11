
class Solution:
    def isIsomorphic(self, s, t):
        if s is None and t is None:
            return True
        if s is None or t is None or len(s) != len(t):
            return False
        
        s_map = {}
        t_map = {}
        
        for i in range(len(s)):
            s_char = s[i]
            t_char = t[i]
            
            if s_char in s_map:
                if s_map[s_char] != t_char:
                    return False
            else:
                s_map[s_char] = t_char
            
            if t_char in t_map:
                if t_map[t_char] != s_char:
                    return False
            else:
                t_map[t_char] = s_char
        
        return True


solution = Solution()
s1 = "egg"
t1 = "add"
print(solution.isIsomorphic(s1, t1))  # True

s2 = "foo"
t2 = "bar"
print(solution.isIsomorphic(s2, t2))  # False

s3 = "paper"
t3 = "title"
print(solution.isIsomorphic(s3, t3))  # True

