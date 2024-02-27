class WordPattern(object):
    '''
        Solution:
        1. Map each character in pattern to each string in list of strings in the same order and vice versa using
            another hashMap.
        2. While updating each HashMap, if a false mapping exists in any hashMap at any point of iteration, return False.
        3. If everything goes correctly, return True

        --- Passed all Leetcode testcases successfully
    '''
    def wordPattern(self, pattern, str):
        """
        :type pattern: str
        :type str: str
        :rtype: bool
        """
        # O(n) Time Complexity | O(n) Space Complexity, where n is the length of bigger string unsplit (not length of pattern)

        strings = str.split() # This takes O(n) time to iterate linearly and split by whitespace and O(n) auxiliary space

        if len(pattern) != len(strings):
            return False

        mapPattern = {}
        mapStrings = {}

        # This takes O(m) time where m is number of words in list of words or number of chars in pattern
        # m < n in general
        # O(n) space for keys in second dictionary (dominates keys in first dictionary)
        for i in range(len(pattern)):

            if pattern[i] not in mapPattern:
                mapPattern[pattern[i]] = strings[i]
            else:
                if mapPattern[pattern[i]] != strings[i]:
                    return False

            if strings[i] not in mapStrings:
                mapStrings[strings[i]] = pattern[i]
            else:
                if mapStrings[strings[i]] != pattern[i]:
                    return False

        return True