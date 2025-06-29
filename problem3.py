# Time Complexity: O(n)

# Space Complexity: O(n)

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        res=s.split(" ")
        res1={}
        res2={}
        if len(res)!=len(pattern):
            return False
        for i in range(len(pattern)):
            if pattern[i] not in res1:
                res1[pattern[i]]=res[i]
            else:
                if res1[pattern[i]] !=res[i]:
                    return False
            if res[i] not in res2:
                res2[res[i]]=pattern[i]
        return len(res1)==len(res2)
            
        