class solution:
    def __init__(self, s, t):
        self.s = s
        self.t = t
    
    def func(self):
        d_s = {}
        d_t = {}

        if len(self.s) != len(self.t):
            return False

        for i in range(len(self.s)):
            if d_s.get(self.s[i]) == None and d_t.get(self.t[i]) == None:
                d_s[self.s[i]] = self.t[i]
                d_t[self.t[i]] = self.s[i]
            
            elif self.s[i] not in d_s or self.t[i] not in d_t:
                return False
            
            elif d_s[self.s[i]] != self.t[i] or d_t[self.t[i]] != self.s[i]:
                return False

        return True

s = "egg"
t = "ada"

new = solution(s, t)
print(new.func())
            