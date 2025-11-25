# Map each character of s to ds with the value of the corresponding value in t. If the map already 
# existis with another value, return false. Then map the letter of t to the corresponding s in map dt. 
# If the map already exists, return false

# Time complexity : O(n)
# SPace complexity: O(n)

class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if len(s)!=len(t):
            return False
        l=len(s)
        ds={}
        dt={}
        for i in range(l):
            if s[i] not in ds:
                ds[s[i]]=t[i]
            else:
                if ds[s[i]]!=t[i]:
                    return False
            
            if t[i] not in dt:
                dt[t[i]]=s[i]
            else:
                if dt[t[i]]!=s[i]:
                    return False
        return True
            

        