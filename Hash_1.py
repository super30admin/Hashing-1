input = ["tree", "erte", "trag", "gart"]
dict={}

set_a = ()

for i in  input:
    p=sorted(i)
    temp = ''.join(p)
    print(temp)
    dict[temp] = []


arr=[]

for i in input:
    r = sorted(i)
    joined = ''.join(r)
    if joined in dict:
        dict[joined].append(i)

for i in dict:
    arr.append(dict[i])
    
print(arr)
