# Logic: Get the unique letters from pattern and uinque words from str. check the length
# Time: O(n) nis number of unique char/sting
# Space: O(n)
def pattern_check(pattern,str):
    pattern_set = set(pattern)
    str_set = set(str.split(" "))
    if len(pattern_set) != len(str_set):
        return False
    return True

print(pattern_check(pattern = "abba", str = "dog cat cat fish"))
print(pattern_check(pattern = "abba", str = "dog cat cat dog"))
print(pattern_check(pattern = "aaaf", str = "dog dog dog fish"))
print(pattern_check(pattern = "aaa", str = "dog dog dog"))