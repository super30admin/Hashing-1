# // Time Complexity : O(N)
# // Space Complexity : O(N)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No
# Solving this problem using 2 dictionaries. Similar to 205. Isomorphic strings
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        dict_pat = {}
        dict_s = {}
        for pat, word in zip(pattern,s.split(" ")):
            if len(pattern)!=len(s.split(" ")):
                return False
            if pat not in dict_pat:
                dict_pat[pat] = word
            else:
                if dict_pat[pat] != word:
                    return False
            if word not in dict_s:
                dict_s[word] = pat
            else:
                if dict_s[word] != pat:
                    return False
        return True
        