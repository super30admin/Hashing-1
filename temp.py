s = "abcbe"
mydict = {}

for i in range(len(s)):
    if s[i] not in mydict:
        mydict[s[i]] = 1
    else:
        mydict[s[i]] += 1
flag = 0
vals = list(mydict.values())
print("The values are")
print(vals)
n = len(vals)
for i in range(0, n, 1):
    print("Index "+str(i) + " = "+str(vals[i]))
    if vals[i] % 2 == 1 and flag == 0:
        flag += 1  
    elif vals[i] % 2 == 1:
        print("Flag = "+str(flag)+" Index "+str(i) + " = "+str(vals[i]))
        flag += 1
        vals[i] = 0

for v in vals:
    print(v)
print("The vals are")
print(vals)
print("------")
print(sum(vals))