"""
Rasika Sasturkar
Time Complexity: O(n)
Space Complexity: O(1)
"""


def isIsomorphic(s: str, t: str) -> bool:
    """
    This code contains checking isomorphic strings using a map and a set.
    We check the letter in map, if it is present then check its corresponding
    value. Or if the letter is not present in map, we check in the set and if it
    is still not present in set, then add in the set. In this way, we are making
    sure that every letter is matched to its unique corresponding value.
    """
    # check base case - not required here
    if len(s) != len(t):
        return False

    # implementation using a map and a set
    s_map = {}
    t_set = set()

    for i in range(len(s)):
        if s[i] in s_map:
            if s_map[s[i]] != t[i]:
                return False
        else:
            if t[i] in t_set:
                return False
            else:
                t_set.add(t[i])
                s_map[s[i]] = t[i]
    return True


def main():
    """
    Main function - an example from LeetCode problem to show the working.
    This code ran successfully on LeetCode and passed all test cases.
    """
    s1 = "egg"
    t1 = "add"
    print(isIsomorphic(s1, t1))  # returns True
    s2 = "foo"
    t2 = "bar"
    print(isIsomorphic(s2, t2))  # returns False
    s3 = "paper"
    t3 = "title"
    print(isIsomorphic(s3, t3))  # returns True


if __name__ == "__main__":
    main()
