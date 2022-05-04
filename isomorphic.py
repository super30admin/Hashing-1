def isIsomorphic(s, t):
    if len(s)!=len(t): return False
    shash={}
    thash={}
    for i in range(len(s)):
        if s[i] in shash:
            if shash[s[i]]!=t[i]:
                return False
        else:
            shash[s[i]]=t[i]
        
    for i in range(len(s)):
        if t[i] in thash:
            if thash[t[i]]!=s[i]:
                return False
        else:
            thash[t[i]]=s[i]
                
    return True       

print(isIsomorphic("egg","add"))