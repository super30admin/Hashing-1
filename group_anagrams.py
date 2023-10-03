# TC : O(nklogk) - if each string is length k, the sorting the string would take klogk and
# as we have n strings we nklogk
# SC : O(nk) - 
# where n is the input size of arr 

# Approach - 


def group_anagrams(arr):
    anagram_map = {}
    for val in arr:
        key = "".join(sorted(val))
        if key not in anagram_map:
            anagram_map[key] = []
        anagram_map[key].append(val)
    return [val for key,val in anagram_map.items()]

def main():
    print(group_anagrams(["eat", "tea", "tan", "ate", "nat", "bat"]))


if __name__ == "__main__":
    main()