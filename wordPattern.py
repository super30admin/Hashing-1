import collections
class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """

        words = s.split(" ")
        # the number of distinct words must equal distinct chars in pattern
        if len(set(pattern)) != len(set(words)):
            return False
        mapping = collections.defaultdict()
        # create of map for pattern to word in string
        for index, char in enumerate(pattern):
            val = words[index]
            if char not in mapping:
                # Ensure that the word is not mapped to another char
                if val not in mapping.values():
                    mapping[char] = val
                else:
                    return False
            else:
                # Ensure char in not mapped tp another val
                if mapping[char] != val: return False
            words[index] = char

        return pattern == "".join(words)