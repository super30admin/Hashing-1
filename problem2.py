
#Time Complexity: O(n) 
#Space Complexity: O(n) 
#Have 2 mapping os s->t and t->s for each character in both strings. 
# If there is a mismatch in the mapping return False. Else return True
class Solution:
    def isIsomorphic(self, source: str, target: str) -> bool:
        s_to_tmap = {}
        t_to_smap = {}
        
        for src_char, tgt_char in zip(source, target):
            if s_to_tmap.get(src_char) is None and t_to_smap.get(tgt_char) is None:
                s_to_tmap[src_char] = tgt_char
                t_to_smap[tgt_char] = src_char
            else:
                if s_to_tmap.get(src_char) != tgt_char or t_to_smap.get(tgt_char) != src_char:
                    return False
                    
        return True