def same_pattern(pattern, inputstr):
    i = 0
    inputarr = str.split(' ')
    hash1 = dict() 
    hash2 = dict()
    maxi = len(pattern)
    maxj = len(inputarr) 
    if maxi != maxj:
        return False
    while(i < maxi):
        if (inputarr[i] in hash1):
            if (hash1[inputarr[i]] != pattern[i]):
                return False
        else:
            hash1[inputarr[i]] = pattern[i]
            
        if (pattern[i] in hash2):
            if (hash2[pattern[i]] != inputarr[i]):
                return False
        else:
            hash2[pattern[i]] = inputarr[i]
        i += 1
    return True

print(same_pattern('abba', 'dog dog dog dog'))
