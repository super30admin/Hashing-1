# Time and space complexity is O(N)
class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        words = s.split(" ")
        
        ctowords ={}
        wtochars ={}
        
        if len(pattern) != len (words):
            return False
        
        for i in range(len(pattern)):
            pc = pattern[i]
            w = words[i]
            
            if pc in ctowords and ctowords[pc]!=w :
                return False            
            if w in wtochars and wtochars[w] !=pc :
                return False           
            ctowords[pc]=w
            wtochars[w] =pc
        return True