# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
#
# Any problem you faced while coding this :
#   - Forgetting to enforce a two-way mapping (s -> t AND t -> s) causes false positives.
#   - Mixing up variable names (sChar vs tChar) is easy; keep them clear.
#   - If inputs could differ in length, add a quick length check to avoid index errors.


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        sMap = {} # maps char from s -> corresponding char in t
        tMap = {} # maps char from t -> corresponding char in s

        # Walk through both strings in lockstep by index
        for i in range(len(s)):
            sChar = s[i]
            tChar = t[i]

            # If we've seen sChar before, it must always map to the same tChar
            if sChar in sMap:
                if sMap[sChar] != tChar:
                    return False # mismatch => not isomorphic
            else:
                sMap[sChar] = tChar # first time seeing sChar -> record its mapping

            # If we've seen tChar before, it must always map back to the same sChar
            if tChar in tMap:
                if tMap[tChar] != sChar:
                    return False # mismatch in reverse mapping => not isomorphic
            else:
                tMap[tChar] = sChar # first time seeing tChar -> record reverse mapping

        return True
