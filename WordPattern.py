class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        schar=s.split()
        if(len(pattern)!=len(schar)):
            return False
        print(schar[0])
        hashmap={}
        hashset=set()
        for i in range(len(pattern)):
            if pattern[i] in hashmap.keys():
                if hashmap[pattern[i]]!=schar[i]:
                    return False
            else:
                if schar[i] in hashset:
                    return False
                hashmap[pattern[i]]=schar[i]
                hashset.add(schar[i])
        return True
