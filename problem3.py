class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words=s.split(' ')
        if len(words)!=len(pattern):
            return False
        #Solving it using 2 maps
        dict1={}
        dict2={}
        for i in range(len(pattern)):
            #Checking both the maps if the key already exisits
            #Checking if the value matches for both the maps
            if ((pattern[i] in dict1 and dict1[pattern[i]]!=words[i])  or
                (words[i] in dict2 and dict2[words[i]]!=pattern[i])):
                    return False
            else:
                dict1[pattern[i]]=words[i]
                dict2[words[i]]=pattern[i]
        return True
     