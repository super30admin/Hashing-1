# Implemented in O(n) time complexity.
# Calculated the hash value for each string and inserted it in a hashmap
# if the value of two strings is same, those will be anagrams

from collections import Counter

def calculate_value(str):
    value = 0
    for ch in str:
        value += (ord(ch) - ord('`'))
    return value

mmap = {}
def group_anagrams(strs) -> []:
    anagrams = []
    for str1 in strs:
        value = calculate_value(str1)
        if value not in mmap:
            mmap[value] = [str1]
        else:
            mmap[value].append(str1)

    for value in mmap.values():
       anagrams.append(value) 
    return anagrams


if __name__ == "__main__":
    strs = ["eat", "tea", "tan", "ate", "nat", "bat"]

    anagrams = group_anagrams(strs)
    print(anagrams)
