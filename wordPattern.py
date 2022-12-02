## This is similar to isomorphic string, we are replacing the distint characters with words, so mapping would be based on words
class Solution:
    def pattern(self, s, t):
        mapper ={}
        visited = set()
        t = t.split()

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