# maintain a map of each character in pattern with each string in the input.
# if string is found, check with the already inserted value from the map.
# O(n) is time complexity
mmap = {}
def is_pattern(s, pattern) -> bool:
    strs = s.split(" ")
    if (len(pattern) != len(strs)):
        return False
    for i in range(0, len(pattern)):
        if pattern[i] not in mmap:
            mmap[pattern[i]] = strs[i]
        else:
            if mmap[pattern[i]] != strs[i]:
                return False
    return True

if __name__ == "__main__":
    pattern = "abba"
    s = "dog cat cat fish"
    print(is_pattern(s, pattern))