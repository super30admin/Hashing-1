def isIsomorphic(self, s,t):
    '''
    Two hashmaps will be used to compare one to one mapping
    Time complexity = O(n)
    Space Complexity = O(1) As alphabets are 26 and hence hashmap keys will be 26 only
    '''
    if len(s) != len(t):
        return False

    sdict = {}
    tdict = {}

    for i in range(len(s)):
        if s[i] not in sdict.keys():
            sdict[s[i]] = t[i]
        elif sdict[s[i]] != t[i]:
            return False
        if t[i] not in tdict.keys():
            tdict[t[i]] = s[i]
        elif tdict[t[i]] != s[i]:
            return False
    return True 

result = isIsomorphic("egg","add")     
print(result)  
