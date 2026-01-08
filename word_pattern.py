"""
time - o(n)
space - o(n)
same as isomorphic string we link each word and store them as key value
pairs in two dictionaries (with key and value interchanged) and if the pattern
does not repeat return false
"""


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s_list = s.split()
        if len(s_list) != len(pattern):
            return False
        s_map = {}
        c_map = {}
        for i in range(len(pattern)):
            if pattern[i] not in s_map and s_list[i] not in c_map:
                s_map[pattern[i]] = s_list[i]
                c_map[s_list[i]] = pattern[i]
            elif (
                s_map.get(pattern[i]) != s_list[i] or c_map.get(s_list[i]) != pattern[i]
            ):
                return False
        return True
