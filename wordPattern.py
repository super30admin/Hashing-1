# Time: O(n), n is length of string s
# space: O(n)

#issues faced: case where pattern size and number of words in s does not match
#Approach:
#similar to isomorphic strings
#use static array of size 26 and a hash set for mapping

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        p2s, p2s_values = [None for _ in range(26)], set()
        start, j, i = 0, 0, 0
    
        while i <= len(s) and j < len(pattern):
            if i == len(s) or s[i] == " ":
                string = s[start:i]
                start = i+1
                idx = ord(pattern[j])-ord('a')
                if not p2s[idx]:
                    if string in p2s_values:
                        return False
                    elif string not in p2s_values:
                        p2s[idx] = string
                        p2s_values.add(string)
                elif p2s[idx] != string:
                    return False
                j += 1
            i += 1
        if i == len(s) + 1 and j == len(pattern):
            return True 
        else: 
            return False