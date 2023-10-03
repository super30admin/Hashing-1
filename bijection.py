
def wordPattern(pattern: str, s: str) -> bool:
    words = s.split(" ")
    
    pattern_word_map = {}
    word_pattern_map = {}

    if(len(words) != len(pattern)):
        return False

    for index, char in enumerate(pattern):

        if words[index] in word_pattern_map:
            if word_pattern_map[words[index]] != char:
                return False

        if char in pattern_word_map:
            if pattern_word_map[char] != words[index]:
                return False

        pattern_word_map[char] = words[index]
        word_pattern_map[words[index]] = char

    return True


def main():
    print(wordPattern("abba", "dog cat cat dog"))
    print(wordPattern("abba", "dog cat cat fish"))
    print(wordPattern("aaaa", "dog cat cat dog"))

if __name__ == "__main__":
    main()