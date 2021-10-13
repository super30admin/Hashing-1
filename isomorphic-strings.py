# Time Complexity : O(n))
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


def is_isomorphic(s: str, t: str) -> bool:
    if len(s) != len(t):
        return False

    new_string = ''
    initial_mapping = {}
    for i in range(0, len(s)):
        if t[i] not in initial_mapping.values():
            initial_mapping[s[i]] = t[i]

    for i in range(0, len(s)):
        if s[i] not in initial_mapping:
            return False
        else:
            new_string += initial_mapping[s[i]]
    return new_string == t


print(is_isomorphic('abba', 'abba'))
