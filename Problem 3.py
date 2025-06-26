class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s = s.split(" ")
        if len(s)!= len(pattern): return False

        hashmap = {}
        seen = set()
        for i in range(len(pattern)):
            if pattern[i] in hashmap:
                if hashmap[pattern[i]] != s[i]:
                    return False
            else:
                if s[i] in seen:
                    return False
                seen.add(s[i])
                hashmap[pattern[i]] = s[i]
        return True
        
