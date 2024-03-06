#T.C: O(nklogk) k is the maximum length of string
#S.C: O(nk)
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hmap = {}
        for i in strs:
            key = tuple(sorted(i))
            #if key not in hashmap, it initializes one
            if key not in hmap:
                hmap[key] = []
            hmap[key].append(i)
    
        ls = []
        for l in hmap.values():
            ls.append(l)
        #returns the values of the list
        return ls
        
