#Anagram
class Solution:

    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagrammap = {}

        for word in strs:
            sortedword = ''.join(sorted(word))

            if sortedword in anagrammap:
                anagrammap[sortedword].append(word)
            else:
                anagrammap[sortedword] = [word]
        
        return list(anagrammap.values())

    def isAnagram(self, s: str, t: str) -> bool:
        smap = {}
        tmap = {}

        if len(s) != len(t):
            return False
        
        for i in range(len(s)):
            schar = s[i]
            if schar in smap:
                smap[schar] +=1
            else:
                smap[schar] = 1 
        
            tchar = t[i]
            if tchar in tmap:
                tmap[tchar] +=1
            else:
                tmap[tchar] = 1
        
        for key in smap:
            if key not in tmap or smap[key] != tmap[key]:
                return False
        
        return True