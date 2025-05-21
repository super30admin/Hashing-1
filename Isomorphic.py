'''
Maintain two dicts for character mappings s->t and t->s
Before insertaiomn check if incoming character  for string - s exists and maps to a different character from second string t
Check for both and return false
If we reach end of loop we return false
'''
class Isomorphic:
    def isIsomorphic(self, s: str, t: str) -> bool:
        mapST, mapTS = {}, {}
        for c1, c2 in zip(s, t):
            if ((c1 in mapST and mapST[c1] != c2) or 
                (c2 in mapTS and mapTS[c2] != c1)):
                return False
            mapST[c1] = c2
            mapTS[c2] = c1
        return True