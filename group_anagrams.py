# Time Complexity :
# Space Complexity :
# Did this code successfully run on Leetcode :
# Any problem you faced while coding this :
#
# Approach (3 sentences only):
#

from typing import Callable, Dict, Iterator, List, Optional, Tuple
from collections import defaultdict

class Solution:

    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        map_strs = defaultdict(list)
        for word in strs:
            sort_list = sorted(word)
            sorted_word = "".join(sort_list)
            map_strs[sorted_word].append(word)

        return list(map_strs.values())

TESTS = [
    # (strs, expected, what it checks)
    (["eat", "tea", "tan", "ate", "nat", "bat"], [["bat"], ["nat", "tan"], ["ate", "eat", "tea"]], "basic"),
    ([""], [[""]], "single empty string"),
    (["a"], [["a"]], "single word"),
    (["", ""], [["", ""]], "two empty strings"),
    (["", "a"], [[""], ["a"]], "empty vs non-empty"),
    (["ab", "ba", "abc", "cab", "aab", "aba"], [["ab", "ba"], ["abc", "cab"], ["aab", "aba"]], "different lengths"),
    (["aab", "abb"], [["aab"], ["abb"]], "same letters, different counts"),
    (["abc", "def", "ghi"], [["abc"], ["def"], ["ghi"]], "no anagrams"),
    (["abc", "bca", "cab", "acb"], [["abc", "bca", "cab", "acb"]], "all one group"),
    (["dog", "dog", "god"], [["dog", "dog", "god"]], "duplicate words"),
    (["ac", "bb"], [["ac"], ["bb"]], "same letter sum, not anagrams"),
    (["a" * 100, "a" * 99 + "b", "b" + "a" * 99], [["a" * 100], ["a" * 99 + "b", "b" + "a" * 99]], "max word length"),
    (["abc", "cba"] * 5000, [["abc", "cba"] * 5000], "max list length"),
]


def normalize(groups):
    return sorted(sorted(g) for g in groups)


if __name__ == "__main__":
    failed = 0
    for strs, expected, desc in TESTS:
        try:
            got = Solution().groupAnagrams(strs)
            ok = normalize(got) == normalize(expected)
        except Exception as e:
            got, ok = f"error: {e!r}", False
        if not ok:
            failed += 1
            show = strs if len(strs) <= 6 else strs[:6] + ["..."]
            print(f"FAIL  {desc}: strs={show} -> got {str(got)[:80]}")
    print(f"\n{len(TESTS) - failed}/{len(TESTS)} passed")
