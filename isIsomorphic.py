class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        hash_map= {}
        hash_set=set([])
        if len(s)!=len(t):
            return False
        for key,val in zip(s,t):
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