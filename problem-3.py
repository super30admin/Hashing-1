#time-comp- O(n*mlogm) as Where n is the number of words, and m is the length of the word.m log(m) is for sorting the word, and we do this for n words.
#space comp- O(k) length of keys in the dict
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        d = {}
        for i in strs:
            key=''.join(sorted(i))
            if key in d:
                d.get(key).append(i)
            else:
                d[key]=[i]
        return d.values()
    
    

                   
        
