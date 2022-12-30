class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        p = pattern
        s = s.split(" ")
        # print(len(s))
        # print(p)
        
        if len(pattern)!= len(s):
            return False

        pMap = {}
        sMap = {}

        for i in range(len(s)):
            if p[i] not in pMap:
                pMap[p[i]] = s[i]
            else:
                if pMap[p[i]]!= s[i]:
                    return False

            if s[i] not in sMap:
                sMap[s[i]] = p[i]
            else:
                if sMap[s[i]]!=p[i]:
                    return False

        return True