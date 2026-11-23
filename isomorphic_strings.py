# Time Complexity : O(n) as we go through the entire list in the array
# Space Complexity : O(k) for space complexity for saving the k unique elements from t string and worst case can be O(N)
# Did this code successfully run on Leetcode :
# Any problem you faced while coding this :
#
# Approach (3 sentences only):
#

from typing import Callable, Dict, Iterator, List, Optional, Tuple
from collections import defaultdict

class Solution:

    def is_isomorphic(self, s: str, t: str) -> bool:
        s_to_t = defaultdict(str)
        unique_t = set()

        if len(s) != len(t):
            return False

        for i in range(len(s)):
            if s[i] in s_to_t:
                if s_to_t[s[i]] != t[i]:
                    return False
            else: 
                if t[i] in unique_t:
                    return False
                s_to_t[s[i]] = t[i]
                unique_t.add(t[i])
            
        return True

TESTS = [
    # (s, t, expected, what it checks)
    ("egg", "add", True, "basic"),
    ("foo", "bar", False, "one s char -> two t chars"),
    ("paper", "title", True, "basic, longer"),
    ("ab", "aa", False, "two s chars -> same t char"),
    ("badc", "baba", False, "two s chars -> same t char, later in string"),
    ("aa", "ab", False, "same s char -> different t chars"),
    ("abc", "xyz", True, "all distinct"),
    ("abc", "abc", True, "char maps to itself"),
    ("a", "a", True, "single char"),
    ("a", "b", True, "single char, different"),
    ("abba", "xyyx", True, "repeats in both directions"),
    ("abba", "xyyy", False, "breaks only at the last char"),
    ("ab", "ba", True, "swap"),
    ("13", "42", True, "digits"),
    ("a b", "c d", True, "space is a character"),
    ("a b", "cdd", False, "space and letter -> same char"),
    ("a" * 50000, "b" * 50000, True, "max length, one mapping"),
    ("ab" * 25000, "cc" * 25000, False, "max length, collision"),
]


if __name__ == "__main__":
    failed = 0
    for s, t, expected, desc in TESTS:
        try:
            sol = Solution()
            got = sol.is_isomorphic(s, t)
        except Exception as e:
            got = f"error: {e!r}"
        if got != expected:
            failed += 1
            show_s = s if len(s) <= 20 else s[:20] + "..."
            show_t = t if len(t) <= 20 else t[:20] + "..."
            print(f"FAIL  {desc}: s={show_s!r}, t={show_t!r} -> got {got}, expected {expected}")
    print(f"\n{len(TESTS) - failed}/{len(TESTS)} passed")