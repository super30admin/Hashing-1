class Solution:
    def groupAnagrams(self, strs):
        
        dic = {}
        for word in strs:
            sortedword = "".join(sorted(word))
            
            if sortedword not in dic:
                dic[sortedword] = [word]
                
            else:
                dic[sortedword].append(word)
                
        
        result = []
        for item in dic.values():
            result.append(item)
        
        return result
        
s = Solution()
strs = ["eat","tea","tan","ate","nat","bat"]
s.groupAnagrams(strs)

# TC: O(n)
# SC: O(n)