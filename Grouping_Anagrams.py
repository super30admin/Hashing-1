##TC: O(N)
##SC: O(N)
from collections import defaultdict
class Solution:
    def groupAnagram(strs:list[str])->list[list[str]]:
        dic = defaultdict(list)
        for word in strs:
            lst = [0]*26 
            for char in word:
                lst[ord(char)-ord('a')]=+1
            lst = tuple(lst)
            dic[lst].append(word) 
        return dic.values()      
        
        
print(Solution.groupAnagram(["eat","tea","tan","ate","nat","bat"]))
        
