# Time Complexity : O(Log(n))
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


def word_pattern(pattern: str, s: str) -> bool:
    keys = [character for character in pattern]
    values = s.split(' ')
    if len(keys) != len(values):
        return False
    pattern_dict = {}
    for i, key in enumerate(keys):
        if values[i] not in pattern_dict.values():
            pattern_dict[keys[i]] = values[i]
    matched_string = None
    try:
        for key in keys:
            if matched_string is None:
                matched_string = pattern_dict[key]
            else:
                matched_string += ' ' + pattern_dict[key]
    except Exception as e:
        return False
    return matched_string == s


print(word_pattern('abba', 'dog cat cat dog'))
