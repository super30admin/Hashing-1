#Time Complexity: O(n)
#Space Complexity: O(n)
#Problem sucessfully accepted in leetcode: yes
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        PtoSmap={}
        StoPmap={}
#create a list of words from input string s
        strings=s.split(' ')
#If length of pattern and words in strings do not match, return false
        if len(pattern)!=len(strings):
            return False
#Map each element from S to T in hashmap
        for i in range(len(pattern)):
            if pattern[i] not in PtoSmap:
                PtoSmap[pattern[i]]=strings[i]
#If current char of pattern is mapped to different word from strings already, return False
            else:
                if PtoSmap[pattern[i]]!=strings[i]:
                    return False
#Repeat the process for see if each word from strings maps to char in pattern
        for i in range(len(strings)):
            if strings[i] not in StoPmap:
                StoPmap[strings[i]]=pattern[i]
            else:
                if StoPmap[strings[i]]!=pattern[i]:
                    return False
        return True