# 290. Word Pattern

# Time Complexity: O(N)
# Space Complexity: O(1)

class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        SSplit = s.split(' ')

        if len(SSplit) != len(pattern):
            return False
        
        PMap = dict()
        SSet = set()

        for i in range(len(pattern)):
            if pattern[i] not in PMap:
                if SSplit[i] in SSet:
                    return False
                else:
                    SSet.add(SSplit[i])
                    PMap[pattern[i]] = SSplit[i]
            else:
                if PMap[pattern[i]] != SSplit[i]:
                    return False
        return True
