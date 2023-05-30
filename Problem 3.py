class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        hash_map_pattern_to_s=dict()
        hash_map_s_to_pattern=dict()
        s=s.split()
        length_of_string_pattern=len(pattern)
        length_of_string_s=len(s)
        print(s)
        if(length_of_string_pattern!=length_of_string_s):
            return False
        for i in range(length_of_string_s) :
            print((hash_map_s_to_pattern.get(pattern[i],0)  ))
            if(hash_map_s_to_pattern.get(s[i],0) == 0  and hash_map_pattern_to_s.get(pattern[i],0) == 0 ):
                 #print(s[i])
                 #print(pattern[i])
                 hash_map_s_to_pattern[s[i]]=pattern[i]
                 hash_map_pattern_to_s[pattern[i]]=s[i]
            if((hash_map_s_to_pattern.get(s[i])!=pattern[i]) and (hash_map_pattern_to_s.get(pattern[i])!=s[i])):
                    return False

        return True