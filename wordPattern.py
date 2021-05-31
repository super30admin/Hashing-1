"""
https://leetcode.com/problems/word-pattern/submissions/

Time Complexity: O(n)
Space Complexity: O(2n) ~ O(n)

This works on Leetcode.
I did not find any errors.

"""

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split(" ")  # O(n)

        if len(pattern) != len(words):
            return False

        hashmap1 = {}
        hashmap2 = {}
        for letter in range(len(pattern)):  # O(n)
            if pattern[letter] in hashmap1:
                if hashmap1[pattern[letter]] != words[letter]:
                    return False
            else:
                hashmap1[pattern[letter]] = words[letter]

            if words[letter] in hashmap2:
                if hashmap2[words[letter]] != pattern[letter]:
                    return False
            else:
                hashmap2[words[letter]] = pattern[letter]
        return True

# obj = Solution()
# print(obj.wordPattern("abba", "dog cat cat dog"))