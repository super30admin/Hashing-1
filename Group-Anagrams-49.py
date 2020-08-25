# Time Complexity : O(nm)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : I previously solved using arrays of 26 chars and then storing in map. After class I changed the approach to using prime nos


# Your code here along with comments explaining your approach 

class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        res = {}
        for s in strs:
            prime = self.getPrime(s)
            if prime not in res:
                res[prime] = [s]
            res[prime].append(s)
        return res.values()
    
    def getPrime(self, word):
        prime_list = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101]

        total = 1
        for w in word:
            total = total * prime_list[ord(w) - ord('a')]
        return total
				

s = Solution()
print s.groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"])