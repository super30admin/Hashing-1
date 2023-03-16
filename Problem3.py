#Created a dictionary to track each character in pattern as key and it's corresponding word in Str as value. Iterate each character and
# word in Str and if any key has different value in Str, then return False


def checkPattern(pattern,str):
     dict1 = {}
     pattern_list = [x for x in pattern]
     str_list = str.split(' ')
     for i in range(len(pattern_list)):
         if(pattern_list[i] in dict1.keys()):
             if(dict1[pattern_list[i]] != str_list[i]):
                 return False
         else:
            dict1[pattern_list[i]] = str_list[i]
     return True



pattern = "abba"
str = "dog cat cat dog"
print(checkPattern(pattern,str))



