#executed on LC: yes, 49
#problems: NA
#using sorted key in hashmap
#TC: O(nMlogM), n is length of strs, m is length of each word, mlogm is for sorting it
#SC; O(nM), n is length oof arr, M is max length of a word
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        hmap = {}
        for i in range(len(strs)):
            temp = "".join(sorted(strs[i]))
            if temp not in hmap:
                hmap[temp]= [strs[i]]
            else:
                hmap[temp].append(strs[i])

        return list(hmap.values())

#executed on LC: yes, 49
#problems: NA
#using tuple of frequency map of a word
#TC: O(nMlogM), n is length of strs, m is length of each word, mlogm is for sorting it
#SC; O(nM), n is length oof arr, M is max length of a word
    
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagrams = {}
        for s in strs:
            count = [0]*26
            for c in s:
                count[ord(c) - ord('a')] += 1
            if tuple(count) in anagrams:
                anagrams[tuple(count)].append(s)
            else:
                anagrams[tuple(count)] = [s]
        return list(anagrams.values())
            
                
                