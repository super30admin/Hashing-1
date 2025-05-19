"""
Split the sentence into words and check if length matches the pattern length
Use char_to_word and word_to_char for a 1-1 mapping.
If any mapping doesnt match, return False; else, return True.
"""
"""
Time Complexity: O(n) n is the number of words/characters
Space Complexity: O(n) for the two hash maps
"""

class bijection:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split()
        if len(pattern) != len(words):
            return False

        char_to_word, word_to_char = {}, {}

        for c, w in zip(pattern, words):
            if char_to_word.get(c, w) != w or word_to_char.get(w, c) != c:
                return False
            char_to_word[c] = w
            word_to_char[w] = c

        return True
    
if __name__=="__main__":
    obj = bijection()
    pattern = "abba"
    s = "dog cat cat dog"
    print(obj.wordPattern(pattern,s))
        