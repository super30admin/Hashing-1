# Time Complexity : O(n)
# Space Complexity :O(n)
# Did this code successfully run on Leetcode :yes
# Any problem you faced while coding this :None

# Your code here along with comments explaining your approach in three sentences only
#maintain 2 hashmaps one for s to t mapping and other for t to s mapping

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        stack1 ={}
        stack2 = {}
        s_split = list(s.split(" "))
        if len(pattern) != len(s_split):
            return False
        for i in range(len(pattern)):
            if pattern[i] in stack1:
                if stack1[pattern[i]] != s_split[i]:
                    return False
            else:
                stack1[pattern[i]] = s_split[i]
            if s_split[i] in stack2:
                if stack2[s_split[i]] != pattern[i]:
                    return False
            else:
                stack2[s_split[i]] = pattern[i]
        return True
        
        