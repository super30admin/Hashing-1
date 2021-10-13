# 290. Word Pattern
# https://leetcode.com/problems/word-pattern/

# Time Complexity: O(n)
# Space Complexity: O(n)

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        if not pattern or not s:
            return
        
        temp_dict = dict()
        temp_set = set()
        s = s.split()

        if len(pattern) != len(s):
            return False

        for i in range(len(pattern)):
            if s[i] not in temp_set:
                temp_set.add(s[i])
                if pattern[i] not in temp_dict:
                    temp_dict[pattern[i]] = s[i]
                else:
                    return False
            else:
                if pattern[i] not in temp_dict:
                    return False
                else:
                    if temp_dict[pattern[i]] != s[i]:
                        return False
        return True

obj = Solution()
print(obj.wordPattern('abba', 'dog cat cat fish'))
print(obj.wordPattern('aaaa', 'dog cat cat dog'))
print(obj.wordPattern('aaaa', 'dog dog dog dog'))