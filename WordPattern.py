class Solution:

    """
    Time complexity - O(n) n -> length of pattern/s
    Space complexity - O(n) n -> length of pattern/s
    """
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split(" ")
        # if pattern length is diff from s, same pattern cannot be found
        if len(words) != len(pattern):
            return False
        mapping = dict()
        # to keep track of chars which are mapped already
        mapped_chars = []
        for index in range(0, len(pattern)):
            c = pattern[index]
            w = words[index]
            if w not in mapping:
                if c not in mapped_chars:
                    mapping[w] = c
                    mapped_chars.append(c)
                else:
                    return False
            elif mapping[w] != c:
                return False
        return True
            
         