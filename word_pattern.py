#time complexity:O(m) because we need linear time for split function
#space complexity:o(1) bec hash is limited by alphabet
#passed all cases on LeetCode:yes
#difficulty faced:
# comments:in the code
#https://leetcode.com/problems/word-pattern/submissions/
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        
        #this is a map from char to word
        m1 = {}
        #hash set contains the words
        hs = set()
        words = s.split()
        
        if len(pattern) != len(words): return False
        
        for i in range(0,len(words)):
            if pattern[i] in m1:
                #if key (char) is present in the map but doesnt match current word means char in pattern is mapped to different word in str, ret false
                if m1[pattern[i]] != words[i]:
                    return False
            else:
                #if key isnt present in the map but you find the word in hs, means word is mapped to different pattern char hence false
                if words[i] in hs:
                    return False
            m1[pattern[i]] = words[i]
            hs.add(words[i])
                
        return True