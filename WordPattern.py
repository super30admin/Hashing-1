pattern = "abba"
str = "dog cat cat fish"

def wordPattern(self, pattern, str):
        dict1 = {}
        dict2 = {}
        str1 = str.split(' ')
        if len(str1) != len(pattern):
            return False
        for pat, st in zip(pattern, str1):
            if pat in dict1 and dict1[pat] != st:
                return False
            elif st in dict2 and dict2[st] != pat:
                return False
            else:
                dict1[pat] = st
                dict2[st] = pat

        return True

print(wordPattern(pattern,str))



