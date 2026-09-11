// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach in three sentences only
#I have two hashmaps and split words in s using space and then checked if it is hashmap or not
# If not then added it and if it exists check if it matches the word in other string

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        if not pattern or not s:
            return False
        patterndict = {}
        sdict = {}
        words = s.split()
        if len(pattern) != len(words):
            return False
        for i in range(len(pattern)):
            if pattern[i] not in patterndict:
                patterndict[pattern[i]] = words[i]
            else:
                if patterndict[pattern[i]] != words[i]:
                    return False

        for i in range(len(words)):
            if words[i] not in sdict:
                sdict[words[i]] = pattern[i]
            else:
                if sdict[words[i]] != pattern[i]:
                    return False

        return True
#Time - O(N)
#Space - O(N)