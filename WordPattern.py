## TC O(N)
## SC O(1)
class Solution:
    def word_Pattern(pattern:str,str:str)->bool:
        words = str.split()
        if len(words)!=len(pattern):
            return False
        
        d = {}
        
        for x in range(len(words)):
            if pattern[x] not in d:
                if words[x] in d.values():
                    return False
                
                d[pattern[x]] = words[x]
            else:
                if d[pattern[x]] != words[x]:
                    return False
        return True
    
print(Solution.word_Pattern("abba","dog cat cat dog"))
print(Solution.word_Pattern("aaaa","dog cat cat dog"))
                
        
