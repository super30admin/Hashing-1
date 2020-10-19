# One way to solve this porblem is to maintain a dictionary and store one character of first string as kjey and other as value
# If while irtereating over both arrays, if I found a condition where the value of key does not match the current, I return false as the pattern is broken.
# Time complexirty: O(n)
# Space complexity: O(n)

def isomorphic(s1,s2):
    charDict = dict()
    if (len(s1)!=len(s2)):
        return False
    for i in range(len(s1)):
        if s1[i] not in charDict:
            charDict[s1[i]] = s2[i]
        elif (s1[i] in charDict):
            if (charDict[s1[i]] != s2[i]):
                return False
    return True


s1 = "egg"
s2 = "add"
res = isomorphic(s1,s2)
print(res)