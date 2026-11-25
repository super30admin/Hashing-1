# Time Complexity : O(n) : n being the total char in the word string
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
#Approach: 1. We split the given word string by white space and initiate two hashmaps to track bijection.
#          2. Base condition checks if the len of the split string and the letters are same and then we iterate through both char string and the split array.
#          3. We check the bijections and return False whenever we find a conflict between existing mapping and the new. When the loop ends we return True since no conflicts were found to return False otherwise.



class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split()
        pmap = {}
        wmap = {}

        if len(words) != len(pattern):
            return False
        
        for i in range(len(words)):
            if words[i] in wmap and wmap[words[i]] != pattern[i]:
                return False
            elif pattern[i] in pmap and pmap[pattern[i]] != words[i]:
                return False
            wmap[words[i]] = pattern[i]
            pmap[pattern[i]] = words[i]
        return True