class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        word=''
        result=[]
        for i in range(len(s)):
            if s[i] !=' ':
                word=word+(s[i])
            else:
                result.append(word)
                word=''
        result.append(word)
        if len(pattern)!=len(result):
            return False
        map={}
        map_r={}
        for i in range(len(pattern)):
            if pattern[i] not in map:
                map[pattern[i]]=result[i]
            else:
                if map[pattern[i]]!=result[i]:
                    return False
        for i in range(len(pattern)):
            if result[i] not in map_r:
                map_r[result[i]]=pattern[i]
            else:
                if map_r[result[i]]!=pattern[i]:
                    return False
        return True