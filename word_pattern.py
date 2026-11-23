# Time Complexity : O(n) - to split the words from s and also to over thr entire list of the pattern words O(n) + O(n)
# Space Complexity : O(k) -  to save the k most unique words and worst case can be all words O(n) from s string
# Did this code successfully run on Leetcode :
# Any problem you faced while coding this :
#
# Approach (3 sentences only):
#

from typing import Callable, Dict, Iterator, List, Optional, Tuple


class Solution:

    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split(" ")
        char_to_word = {}
        unique_words = set()

        if len(pattern) != len(words):
            return False

        for i in range(len(words)):
            if pattern[i] in char_to_word: 
                if char_to_word[pattern[i]] != words[i]:
                    return False
            else:
                if words[i] in unique_words:
                    return False
                
                char_to_word[pattern[i]] = words[i]
                unique_words.add(words[i])
        return True

TESTS = [
    # (pattern, s, expected, what it checks)
    ("abba", "dog cat cat dog", True, "basic"),
    ("abba", "dog cat cat fish", False, "letter -> two different words"),
    ("aaaa", "dog cat cat dog", False, "same letter, different words"),
    ("abba", "dog dog dog dog", False, "two letters -> same word"),
    ("aaa", "dog dog dog dog", False, "more words than letters"),
    ("aaaa", "dog dog dog", False, "fewer words than letters"),
    ("a", "dog", True, "single letter, single word"),
    ("ab", "dog dog", False, "two letters -> same word, short"),
    ("aa", "dog cat", False, "same letter -> different words, short"),
    ("abc", "dog cat fish", True, "all distinct"),
    ("abc", "b c a", True, "words look like pattern letters"),
    ("ab", "a b", True, "word equals a different letter"),
    ("aba", "b a b", True, "letters and words cross over"),
    ("aba", "a b a", True, "word same as its own letter"),
    ("abab", "dog cat dog dog", False, "breaks only at the last word"),
    ("aaaa", "dog dog dog dog", True, "all same"),
    ("ab", "dogs dog", True, "prefix words are different words"),
    ("abcdefghij" * 30, " ".join(f"w{i % 10}" for i in range(300)), True, "max pattern length"),
]


if __name__ == "__main__":
    failed = 0
    for pattern, s, expected, desc in TESTS:
        try:
            got = Solution().wordPattern(pattern, s)
        except Exception as e:
            got = f"error: {e!r}"
        if got != expected:
            failed += 1
            show_p = pattern if len(pattern) <= 20 else pattern[:20] + "..."
            show_s = s if len(s) <= 30 else s[:30] + "..."
            print(f"FAIL  {desc}: pattern={show_p!r}, s={show_s!r} -> got {got}, expected {expected}")
    print(f"\n{len(TESTS) - failed}/{len(TESTS)} passed")

