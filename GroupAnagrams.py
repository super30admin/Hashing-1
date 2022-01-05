class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        hashmap = {}
        
        for a in range(0,len(strs)):
            
            keyarr = sorted(strs[a])
            
            key = "".join(keyarr)
            print(key)
            
            if key in hashmap:
                hashmap[key].append(strs[a])
            else:
                hashmap[key] = [strs[a]]
                
        return list(hashmap.values())
        
        print(hashmap)
                    