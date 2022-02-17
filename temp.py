s = 'egg'
t = 'add'
def check(s,t):
    sTot = {}
    tTos = {}
    for sChar,tChar in zip(s,t):
        if (sChar in sTot) and (sChar != sTot[sChar]):
            return False
        elif (tChar in tTos) and (tChar != tTos[tChar]):
            return False
        if sChar not in sTot:
            sTot[tChar] = sChar
        if tChar not in tTos:
            tTos[sChar] = tChar
    return True

print(check(s,t))