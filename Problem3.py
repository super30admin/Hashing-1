class Solution(object):
    def wordPattern(self, pattern, s):
        """
        same as problem2a from Hashing1


        Time complexity: O(n)
        Space complexity: O(1)

        :type pattern: str
        :type s: str
        :rtype: bool
        """
        s = s.split()

        if pattern is None and s is None:
            return True
        if pattern is None or s is None:
            return False
        if len(pattern) != len(s):
            return False

        # Creating maps to store the mapping from entries in pattern to char in string s and vice versa
        patternMap = {}
        sMap = {}
        for i in range(len(pattern)):
            if pattern[i] not in patternMap:
                patternMap[pattern[i]] = s[i]
            else:
                if patternMap[pattern[i]] != s[i]:
                    return False
            if s[i] not in sMap:
                sMap[s[i]] = pattern[i]
            else:
                if sMap[s[i]] != pattern[i]:
                    return False
        # If all characters are mapped consistently, word pattern followed
        return True
