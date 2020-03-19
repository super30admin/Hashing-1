"""
// Time Complexity : O(n2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : No
// Any problem you faced while coding this : Yes

// Your code here along with comments explaining your approach
Algorithm Explanation
1) Idea is to take a approach where we check the anagram for every string
and grooup them by means of hashmap
2) Get a set of strings for O(1) lookup
3) For every string in the list
    - Get the counter dictionary of chars 
    - For every matching dictionary of the string in the set, 
    update the hashmap with key as the original string and value list 
    of matching strings
4) To figure out - How to ensure non duplicate list of strings in the final hashmap
"""
from collections import Counter, defaultdict
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        #strs.sort()
        print(strs)
        strs_set = set(strs)
        
        anagram_map = defaultdict(list)
        for strg in strs:
            dc = Counter(strg)   #{a:1,t:1,e:1}
            for set_strg in strs_set - set(strg):
                new_dc = Counter(set_strg)
                if new_dc == dc:
                    #matching anagram found
                    anagram_map[strg].append(set_strg)
        print(anagram_map)
                
        print(anagram_map.values())
        
        final_set = set()
        for i in anagram_map.values():
            print(i)
            final_set = final_set.union(set(i))
        print(final_set)