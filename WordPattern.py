"""
    Problem Statement: Given a pattern and a string s, find if s follows the same pattern. 
                       Here follow means a full match, such that there is a bijection between
                       a letter in pattern and a non-empty word in s.

    Approach: In this approach we'd use hash table and hash set. Split the input s by space to get
              the words. If number of words is not equal to the length of the pattern return False.
              Iterate over the pattern and s, if character of the pattern is not in the hash table, 
              store the character with the corresponding word and append the word in the hash set.
              If a character is not present in the hash table and the word is present in the hash set
              then the pattern is incorrect hence return False otherwise the pattern matches.

    Time complexity: O(n)
    
    Space complexity: O(1).

    Accepted on LeetCode? Yes!
    LeetCode Link: https://leetcode.com/problems/group-anagrams/
"""

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        if len(pattern) != len(s.split(" ")):
            return False
        mapper = {}
        mapper_set = set()

        for c, word in zip(pattern, s.split(" ")):
            if c not in mapper:
                if word not in mapper_set:
                    mapper[c] = word
                    mapper_set.add(word)
                else:
                    return False
            else:
                if mapper[c] != word:
                    return False
        return True

if __name__ == "__main__":
    sol = Solution()

    pattern, s = "abba", "dog cat cat dog"
    ret = sol.wordPattern(pattern, s)
    assert ret == True

    pattern, s = "aaaa", "dog cat cat dog"
    ret = sol.wordPattern(pattern, s)
    assert ret == False