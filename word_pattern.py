





class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = str.split(s)
        
        if len(pattern) != len(words):
            return False
        
        dic = {}
        
        for x in range(len(words)):
            if pattern[x] not in dic:
                if words[x] in dic.values():
                    return False
                dic[pattern[x]] = words[x]
            else:
                if dic[pattern[x]] != words[x]:
                    return False
        return True
    
