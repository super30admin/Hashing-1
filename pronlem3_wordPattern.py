#time complexity : O(n) when n is the  lenth of input string
#space complexity: O(n), where n number of unique characters in the pattern
#Submit on leetcode : yes


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        word = s.split()

        if len(word) != len(pattern):
            return False
        
        map_word ={}
        for i in range(len(word)):
            if pattern[i] not in map_word:
                if word[i] in map_word.values():
                    return False
                map_word[pattern[i]] = word[i]
            else:
                if map_word[pattern[i]] != word[i]:
                    return False
        
        return True

sol = Solution()      
pattern1 = "abba"
s1 = "dog cat cat dog"
result1 = sol.wordPattern(pattern1, s1)
print(f"Word pattern match for '{pattern1}' and '{s1}': {result1}")