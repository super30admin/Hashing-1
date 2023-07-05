# Time complexity : O(n)
# Space Complexity : O(n)

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        t = s.split(" ")
        if len(pattern) != len(t):
            return False
        elif len(pattern)==0 and len(t)==0:
            return True
        
        pattern_dict={}
        t_dict={}
        for i in range(0,len(pattern)):
            if pattern_dict.get(pattern[i]) is None:
                pattern_dict[pattern[i]]=t[i]
                valueAtT = t_dict.get(t[i])
                if valueAtT is None:
                    t_dict[t[i]]=pattern[i] 
                else:
                    if valueAtT != pattern[i]:
                        return False
            else:
                if pattern_dict[pattern[i]] != t[i]:
                    return False
        return True