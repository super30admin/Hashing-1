# Time Complexity : O(nklogk + k)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        map={}
        for st in strs: #n
            string=''.join(sorted(st)) #klogk
            if string not in map.keys():
                map[string]=[] 
            map.get(string).append(st) #k
        return map.values()
