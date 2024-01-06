class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        dct = dict() 
        s = s.split(" ")

        if len(pattern) != len(s):
            return False

        for i in range(len(pattern)):
            if pattern[i] not in dct.keys():
                if s[i] not in dct.values():
                    dct[pattern[i]] = s[i]
                else:
                    return False

            elif dct[pattern[i]] != s[i]:
                return False      

        print(dct)
        return True