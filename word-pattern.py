# If both the words arent equal length, return false. Map each letter in pattern to s in dpat.
#  If the map already exists to anoter value, return true. Map each word of s to each letter in pattern. 
#  If the map exists to another value, return false

 
# Time complexity : O(nk)
# SPace complexity: O(1)

class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        dpat={}
        ds={}
        s=s.split(" ")
        if len(s)!=len(pattern):
            return False
        l=len(pattern)
        for i in range(l):
            if pattern[i] not in dpat:
                dpat[pattern[i]]=s[i]
            else:
                if dpat[pattern[i]]!=s[i]:
                    return False
            if s[i] not in ds:
                ds[s[i]]=pattern[i]
            else:
                if ds[s[i]]!=pattern[i]:
                    return False
        return True

        