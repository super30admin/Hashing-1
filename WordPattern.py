#Time Complexity : O(pattern*s)
# Space Complexity : O(pattern*s)
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        t = []
        t = s.split()
        if(len(pattern)!=len(t)):
            return False
        hashmap = dict()
        hashmap2 = dict()
        for i in range(len(pattern)):
            if(hashmap.get(pattern[i]) is None or hashmap.get(pattern[i]) == t[i]):
                hashmap[pattern[i]] = t[i]
            else:
                return False
    
        for i in range(len(t)):
            if(hashmap2.get(t[i]) is None or hashmap2.get(t[i])== pattern[i]):
                hashmap2[t[i]] = pattern[i]
            else:
                return False
        return True
            
s = Solution()
print(s.wordPattern('abba','dog cat cat dog'))












