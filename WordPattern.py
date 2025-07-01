# Time Complexity : O(nk)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes

class Solution(object):
    def wordPattern(self, pattern, s):
        words = s.split(" ")
        if len(pattern) != len(words):
            return False
        pat_s_map = {}
        for i in range(len(words)):
            pat_char = "pat_"+pattern[i]
            word = "s_"+words[i]
            if pat_char in pat_s_map:
                if word in pat_s_map:
                    if words[i] != pat_s_map.get(pat_char) and pattern[i] != pat_s_map.get(word):
                       return False
                else:
                    return False
            elif word in pat_s_map:
                return False
            pat_s_map[pat_char] = words[i]
            pat_s_map[word] = pattern[i]
        return True

#obj = Solution()
#sol1 = obj.wordPattern("abba", "dog cat cat dog")
#print(sol1)
#sol2 = obj.wordPattern("abba", "dog cat cat fish")
#print(sol2)
#sol3 = obj.wordPattern("aaaa", "dog cat cat dog")
#print(sol3)       