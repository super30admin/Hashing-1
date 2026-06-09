#https://leetcode.com/problems/word-pattern/description/
#Time Complexity:O(n)
# Space Complexity:O(n) 
#Did it run on LeetCode: Yes
#Code Logic:first we split the string into array of words, we measure the length of patter and array if they arent equal,we return False
#we create 2 emplty hashmaps using dictionary, then we map the pattern to worda & word to pattern
#if there is a conflict we return False, if there is no entry then we create new mapping
#if there is no conflict we return true
class Solution:
    def wordPattern(self, pattern: str, str_: str) -> bool:
        arr = str_.split()          #split the string into array of words
        n = len(arr)
        k = len(pattern)

        if n!=k:                #compare the length,if it not equal return False
            return False
        
        pmap ={}         # 2 empty hashmaps using dictionary to store the mappings
        amap={}

        for i in range(n):   #check the index position of each char in pattern and array
            pChar = pattern [i]
            wChar = arr[i]

            if pChar in pmap:
                if pmap[pChar]!=wChar:   #if the mappings arent matching return false
                    return False
            else: 
                pmap[pChar] = wChar     # if there is no mapping created, then create new mapping

            if wChar in amap:        #do the same to check mappings from array to pattern
                if amap[wChar]!=pChar:
                    return False
            else:
                amap[wChar] = pChar
        return True                 #if no conflicts then return true