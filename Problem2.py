s = "paper"
t = "title"
dict1 = {}
for char in s:
    if(char in dict1.keys()):
        dict1[char] +=1
    else:
        dict1[char] = 1
dict2 = {}
for char in t:
    if(char in dict2.keys()):
        dict2[char] +=1
    else:
        dict2[char] = 1

if(list(dict1.values()) == list(dict2.values())):
    print('True')
else:
    print('False')