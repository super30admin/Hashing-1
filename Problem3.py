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

        pattern_dict = {}
        used_words = set()

        for i in range(len(words)):
            p = pattern[i]
            w = words[i]

            if p not in pattern_dict:
                if w not in used_words:
                    pattern_dict[p] = w
                    used_words.add(w)
                    continue
                return False
            if p in pattern_dict and pattern_dict[p] != w:
                return False

        return True
