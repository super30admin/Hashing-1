from collections import defaultdict
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        dict1=defaultdict(list)
        for itm in strs:
            sorted_str=''.join(sorted(itm))
            print(sorted_str)
            if sorted_str not in dict1:
                dict1[sorted_str].append(itm)
            else:
                dict1[sorted_str].append(itm)
        return dict1.values() 
            
            
        