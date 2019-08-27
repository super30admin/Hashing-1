# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this :
#    - I started with storing pattern as key and inputarray as value but it was failing some test cases. 
#      Then I did the opposite storing inutstr as key but It was also failing some cases.
#      Using both simulteneously solves the problem but I was wondering If it can be done using only one hashtable.

# Your code here along with comments explaining your approach

def same_pattern(pattern, inputstr):
    # amking array of words by splitting string from space. 
    inputarr = str.split(' ')
    hash1 = dict() 
    hash2 = dict()
    # Checking that both lengths are same
    maxi = len(pattern)
    maxj = len(inputarr) 
    if maxi != maxj:
        return False
    i = 0
    while(i < maxi):
        # if character of pattern already in the hashtable compare it's value to inputstr
        if (inputarr[i] in hash1):
            if (hash1[inputarr[i]] != pattern[i]):
                #not same then return because pattern breaks here.
                return False
        else:
        # if character is not in hashtable store it.
            hash1[inputarr[i]] = pattern[i]
            
        # do the same thing but store inputstr words as key into another hashtable
        if (pattern[i] in hash2):
            if (hash2[pattern[i]] != inputarr[i]):
                return False
        else:
            hash2[pattern[i]] = inputarr[i]
        i += 1
    return True
