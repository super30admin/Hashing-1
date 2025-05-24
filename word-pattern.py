# Time Complexity :O(N)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode :yes
# Any problem you faced while coding this :no


# Your code here along with comments explaining your approach


class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        words = s.split()

        if len(pattern) != len(words):
            return False

        mapS = {}

        mapT = {}

        for i in range(len(words)):

            if words[i] not in mapS:

                mapS[words[i]] = pattern[i] #insert words[i]:pattern[i]

            else:

                if mapS[words[i]] != pattern[i]:

                    return False

            if pattern[i] not in mapT: #mapT used to check if same character mapped to different variable

                mapT[pattern[i]] = words[i]

            else:

                if mapT[pattern[i]] != words[i]:

                    return False

        return True