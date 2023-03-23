# we are trying to get if the pattern is alligned with the given words
# we trying to store each pattern string with the word in hashmap and word with pattern string.
# when we get a new word and pattern string we can check and return true or false

#TC: O(k)
#sc: o(1)



class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words_s = s.split(' ')

        if len(words_s) != len(pattern):
            return False

        pattern_hashmap = {}
        s_hashmap = {}

        for i in range(len(pattern)):
            strings1 = pattern[i]
            words1 = words_s[i]

            if pattern_hashmap != None:
                if pattern_hashmap.get(strings1) != words1:
                    return False
            else:
                pattern_hashmap[strings1] = words1

            if s_hashmap != None:
                if s_hashmap.get(words1) != strings1:
                    return False
            else:
                s_hashmap[words1] = strings1

        return True
