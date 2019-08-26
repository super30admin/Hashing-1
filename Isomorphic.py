"""
The approach here is to store each letter in s as key and it's corresponding letter
at t as value. we iterate through each letters in both the strings. if a particular
key-> value mapping is not found we insert in the dict. while inserting we also check
if the key already exsists for a different value or if the value exsists for a different
key in both the cases if found we return false, else we return true.
"""

class Solution(object):
    def isIsomorphic(self, s, t):
        dict1 = {}
        for i in range(len(s)):
            if s[i] not in dict1:
                if t[i] in dict1.values():
                    return False
                dict1[s[i]] = t[i]
            elif dict1[s[i]] != t[i]:
                return False
        return True

