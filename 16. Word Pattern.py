class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        # Splitting the string into words
        words = s.split(" ")
        # Checking if the number of words matches the pattern length
        if len(words) != len(pattern):
            return False
        # Creating a mapping from pattern characters to words
        pat_to_words = {}
        # Creating a reverse mapping from words to pattern characters
        words_to_pat = {}

        # Iterating through each pattern character and corresponding word
        for p, w in zip(pattern, words):
            # Checking if pattern character already exists with a different word
            if p in pat_to_words and pat_to_words[p] != w:
                return False
            # Checking if word already exists with a different pattern character
            if w in words_to_pat and words_to_pat[w] != p:
                return False
            # Mapping pattern character to word
            pat_to_words[p] = w
            # Mapping word to pattern character
            words_to_pat[w] = p
        # Returning True if all mappings are consistent
        return True

# Time Complexity (TC): O(n) where n is the length of pattern/words
# Space Complexity (SC): O(k) where k is the number of unique characters in pattern
