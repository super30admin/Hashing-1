"""
The approach here is to maintain two dictionary and map each pattern to each corresponding string.
while maping and adding values to the dict check if the key is already present in the dict, if so
check if the key's dict value matches the string's value if not return false same way do the reverse 
mapping from str to pattern here str as key and pattern as val. check for the same conditions mentioned
above. finally if the for loop exits without a false this means that the mappings hold true and are valid.

"""

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



