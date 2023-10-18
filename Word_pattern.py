Time Complexity:- 0(nk)
#Space Complexity:- 0(1)
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split()

        if len(pattern) != len(words):
            return False

        pattern_map = {}  # Map from pattern character to word
        word_set = set()  # Set to keep track of used words

        for i in range(len(pattern)):
            c = pattern[i]
            str1 = words[i]

            if c in pattern_map:
                if pattern_map[c] != str1:
                    return False
            else:
                if str1 in word_set:
                    return False
                pattern_map[c] = str1
                word_set.add(str1)

        return True
