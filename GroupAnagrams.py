# Time Complexity: O(nk(log(k))
# Space Compelxity: O(n)

class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        d={}
        for i in range (len(strs)):
            x=''.join(sorted(strs[i]))
            if x in d:
                d[x].append(strs[i])
            else:
                d[x]=[]
                d[x].append(strs[i])
        return d.values()
