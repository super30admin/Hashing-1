# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : I had to format the chars and words before storing it into the map. Ex: "abc" "b c a". 


# Your code here along with comments explaining your approach 

class Solution(object):
    def wordPattern(self, pattern, str):
        """
        :type pattern: str
        :type str: str
        :rtype: bool
        """
        strs = str.split(' ')
        if len(pattern) != len(strs):
            return False
        
        res = {}
        for i in range(0, len(pattern)):
            p = pattern[i]
            s = strs[i]

            p = 'char_' + p
            s = 'word_' + s

            if p not in res:
                res[p] = i
            if s not in res:
                res[s] = i

            if res[p] != res[s]:
                return False
          
        return True

s = Solution()
print s.wordPattern("abba", "dog cat cat fish")