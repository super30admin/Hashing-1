import collections

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = []
        index= 0 

        for i in range(len(s)):
            if s[i] == ' ':
                words.append(s[index:i])
                index= i+1
            if i == len(s)-1:
                words.append(s[index:])

        if len(words)!=len(pattern):
            return False

        mapping1 = collections.defaultdict(str)

        for i in range(len(words)):
            if words[i] not in mapping1:
                mapping1[words[i]] = pattern[i]
            else:
                if mapping1[words[i]] != pattern[i]:
                    return False

        mapping2 = collections.defaultdict(str)

        for i in range(len(words)):
            if pattern[i] not in mapping2:
                mapping2[pattern[i]] = words[i]
            else:
                if mapping2[pattern[i]] != words[i]:
                    return False

        return True
    