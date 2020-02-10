'''
Time Complexity : O(n) Iterate through the string

Space Complexity : O(n)

Did this code successfully run on Leetcode : Yes

Explanation: Create Hashmap (dictionary in  python)

We use the character of the first string as key for the hashmap (dictionary in python).

if the hash of first string (which is the key) does not exist in the dictionary then check if the value does
not match the existing value -> if this is true then return False else If the character in the second string already
exists as a value in the dictionary then return False else assign the character of the second string as the dictionary
value of the first character.

If loop exits without returning false return True.
'''


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        mydict = {}
        for i, j in zip(s, t):
            if i in mydict.keys():
                if mydict[i] != j:
                    return False
            else:
                if j in mydict.values():
                    return False
                else:
                    mydict[i] = j

        return True