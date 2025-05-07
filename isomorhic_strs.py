#time complexity:o(logn)
#space complexity:o(1) because hashmap will be created for all chars and there will be at most 26 keys
#passed all cases on LeetCode: yes
#difficulty faced: if/else condition and when to add elements to map/set
# comments:in the code
#https://leetcode.com/problems/isomorphic-strings/

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        #map has element of s as key and set has elements of t
        map_s = {}
        set_t = set()
        
        if len(s) != len(t): False
        
        for i in range(0,len(s)):
            if s[i] in map_s :
                #check if the value where s[i] is key doesnt match value at t
                if map_s[s[i]] != t[i]:
                    return False
                
            else:
                if t[i] in set_t:
                    return False
            map_s[s[i]] = t[i]
            set_t.add(t[i])
            
        return True