class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        hash_map_s_to_t=dict()
        hash_map_t_to_s=dict()
        length_of_string_s=len(s)
        length_of_string_t=len(t)
        if(length_of_string_s!=length_of_string_t):
            return False
        for i in range(length_of_string_s) :
            if(hash_map_s_to_t.get(s[i],0) == 0  and hash_map_t_to_s.get(t[i],0) == 0 ):
                 print(s[i])
                 hash_map_s_to_t[s[i]]=t[i]
                 hash_map_t_to_s[t[i]]=s[i]
            if((hash_map_s_to_t.get(s[i])!=t[i]) and (hash_map_t_to_s.get(t[i])!=s[i])):
                    return False

        return True