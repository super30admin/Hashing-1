class Solution:
    def isIsomorphic(self, s, t):
        if len(s) != len(t):
            return False
        
        dic = {}
        
        for i,j in zip(s,t):
            dic[i] = j
            
        if (len(set(dic.values())) != len(dic.values())):
            return False
        
        strng = ''
        
        for i in s:
            strng += dic[i]
         
        if (strng == t):
            return True
        
        return False

s = Solution()
s.isIsomorphic('egg', 'add')

# TC: O(n)
# SC: O(n)