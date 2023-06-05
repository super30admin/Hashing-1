# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : NA

# Approach is to create a hash map with sorted letters and group all the anagrams together with the same letters.   

class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        d={}
        l=[]
        for i in strs:
            k=''.join(sorted(i))
            print(k)
            if k in d:
                l=d[k]
                l.append(i)
                d[k]=l
            else:
                l=[]
                l.append(i)
                d[k]=l
        return d.values()