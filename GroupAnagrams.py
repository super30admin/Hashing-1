"""
Rasika Sasturkar
Time Complexity: O(n.klogk)
Space Complexity: O(n.k)
where, n is no. of words and k is avg. length of word
"""


def groupAnagrams(strs):
    """
    We iterate over each string in the list and sort it. We add the sorted
    string as key in the map and the values will be all the strings with
    same sorted strings.
    Alternative to this approach is calculating the prime products of strings,
    but I was not able to implement this in Python.
    """
    group_map = {}
    for each_string in strs:
        sorted_key = ""
        sorted_key = sorted_key.join(sorted(each_string))

        if sorted_key not in group_map:
            group_map[sorted_key] = []
        group_map[sorted_key].append(each_string)
    return group_map.values()


def main():
    """
    Main function - an example from LeetCode problem to show the working.
    This code ran successfully on LeetCode and passed all test cases.
    """
    strs1 = ["eat", "tea", "tan", "ate", "nat", "bat"]
    print(groupAnagrams(strs1))  # returns [['eat', 'tea', 'ate'], ['tan', 'nat'], ['bat']]
    strs2 = [""]
    print(groupAnagrams(strs2))  # returns [['']]
    strs3 = ["a"]
    print(groupAnagrams(strs3))  # returns [['a']]


if __name__ == "__main__":
    main()
