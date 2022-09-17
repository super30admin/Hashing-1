class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        hash_map= {}
        hash_set=set([])
        word= s.split()
        if len(word)!=len(pattern):
            return False
        for key,val in zip(word,pattern):
            #print (key,val)
            if key not in hash_map:
                hash_map[key]=val
            elif hash_map[key] != val:
                return False
            if val not in hash_set:
                hash_set.add(val)
        if len(hash_map)==len(hash_set):
            return True
        return False