"""
Rasika Sasturkar
Time Complexity: O(n)
Space Complexity: O(1)
"""


def wordPattern(pattern: str, s: str) -> bool:
    """
    Using one map to store the pattern and its corresponding words.
    And another map to store the word and its corresponding pattern.
    Anytime they do not match we return False - Similar to isomorphic strings.
    """
    char_map = {}
    word_map = {}

    word_list = s.split()
    if len(pattern) != len(word_list):
        return False

    for i in range(len(pattern)):
        if word_list[i] in char_map:
            if char_map[word_list[i]] != pattern[i]:
                return False
        else:
            char_map[word_list[i]] = pattern[i]

        if pattern[i] in word_map:
            if word_map[pattern[i]] != word_list[i]:
                return False
        else:
            word_map[pattern[i]] = word_list[i]

    return True


def main():
    """
    Main function - an example from LeetCode problem to show the working.
    This code ran successfully on LeetCode and passed all test cases.
    """
    pattern1 = "abba"
    s1 = "dog cat cat dog"
    print(wordPattern(pattern1, s1))  # returns True
    pattern2 = "aaaa"
    s2 = "dog cat cat dog"
    print(wordPattern(pattern2, s2))  # returns False


if __name__ == "__main__":
    main()
