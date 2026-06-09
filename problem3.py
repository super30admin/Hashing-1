# Time Complexity : O(n) because we are iterating through the string once to create the mapping and once to check the mapping
# Space Complexity : O(n) because we are creating a mapping of the characters in the string s and t
# Did this code successfully run on Leetcode : yes 
# Any problem you faced while coding this : a little bit of confusion in the mapping part, but I was able to figure it out after some time, I have used two hash maps to store the mapping of the characters in the string s and t, and then I have checked if the mapping is correct or not, if it is correct then I have returned true, otherwise I have returned false.


class Solution(object):
    def wordPattern(self, pattern, s):
        word = s.split()
        n = len(word)
        k = len(pattern)

        if n != k:
            return False
        
        pMap = {}
        sMap = {}

        for i in range(n):
            a = pattern[i]

            if a not in pMap:
                pMap[a] = word[i]
            else:
                if pMap[a] != word[i]:
                    return False

            if word[i] not in sMap:
                sMap[word[i]] = a
            else:
                if sMap[word[i]] != a:
                    return False

        return True
        
        