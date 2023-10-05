#TC: O(m + n), m is length of pattern , n is length of s
#SC: O(26n), 26 is max unique keys in pattern in hmap , n is max length of s
#executed on LC: yes 290
# problems: misssed to check the edge case where length differ
class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        hmap = {}
        hset = []
        words = s.split()
        
        # ex: "aa", "aa aa aa"
        if len(words) != len(pattern):
            return False
        
        for i in range(len(pattern)):
            if pattern[i] not in hmap:
                if words[i] not in hset:
                    hmap[pattern[i]] = words[i]
                else:
                    #if word already in hashset , return F as two keys cannot map to same word
                    return False
                hset.append(words[i])
            else:
                #if word already in hashset , return F as one key cannot map to two words
                if hmap[pattern[i]] != words[i]:
                    return False
        return True