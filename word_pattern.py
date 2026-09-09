'''
290 Word pattern
https://leetcode.com/problems/word-pattern/description/

Given a pattern and a string str, find if str follows the same pattern. Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Example 1: Input: pattern = "abba", str = "dog cat cat dog" Output: true

Example 2: Input: pattern = "abba", str = "dog cat cat fish" Output: false

Example 3: Input: pattern = "aaaa", str = "dog cat cat dog" Output: false

Example 4: Input: pattern = "abba", str = "dog dog dog dog" Output: false Notes: You may assume pattern contains only lowercase letters, and str contains lowercase letters that may be separated by a single space.

Assume there are N characters in the pattern, N words in the str, and avg of M chars per word. Hence, there are NM characters in str.

Solution:
1. Brute Force: This is similar to the isomorphic strings problem. At each index i, note the character c = pattern[i] and word w = str[i]. Now, check if this (character, word) = (c,w) pair has already been encountered at a previous index j. We can do this by traversing to the left (j = i-1, i-2, ..., 0) and checking:
    if pattern[j] == c:
        yes: if str[j] == word.
             yes: proceed to the next character i++
        no:  return False (not a bijection map)
    Since for each i, 0<=i<=N-1, we traverse j=0,..,i-1, the time complexity is O(N^2).
Time: O(N^2), Space: O(1)

2. Hashing using two maps:
We use two hashmaps, one each for c2w  (char2word) and w2c (word2char). For c2w, the keys are the characters in pattern and the corresponding values are words in str. For w2c, the keys are the words in str and the corresponding values are chars in pattern. This solution is very similar to LC # 205 Isomorphic strings.

Why can't we use only one hashmap instead of two? Ans: To establish bijection.
Eg. pattern = abbc, str = "dog cat cat dog", then c2w = {a:dog,b:cat,c:dog} (assume only one hash map). Thus, we can convert pattern->str. But for a bijection map, we should be able to convert pattern->str and str->pattern as well. For each word in str, we read the value in c2w and output the corresponding key.  Thus, for the value 'dog', we have two keys
a and c (c2w[a] = dog, c2w[c] = dog). We are unable to choose which key to select because of the many-to-one mapping. Hence, the mapping is not a bijection.
Time: O(NM), Space: O(26 + N) = O(N) (size of word2char map = N since there are N words in the string)

(Note: Space is not O(N + M) because the size of the hash map is restricted to the no. of lowercase letters in pattern which is not dependent on the length of the pattern)
https://www.youtube.com/watch?v=CkfIEdCRlxk

3. Using a hash map and a hash set:
Maintain a hash map which maps a word in s to a char in pattern. Maintain a hash set of characters in pattern to indicate the characters already mapped.
This solution is very similar to LC # 205 Isomorphic strings.
Time: O(NM), Space: O(26 + N) = O(N)
https://youtu.be/CkfIEdCRlxk?t=168


'''
from collections import defaultdict

# Word pattern using 2 hash maps
def word_pattern_2(pattern, s):
    words = s.split() # O(NM)
    N = len(pattern)
    if N != len(words):
        return False
    w2c = defaultdict(str)
    c2w = defaultdict(str)
    for w, c in zip(words, pattern): # O(N)
        if w not in w2c:
            w2c[w] = c
        else:
            if w2c[w] != c:
                return False

        if c not in c2w:
            c2w[c] = w
        else:
            if c2w[c] != w:
                return False
    return True

# Word pattern using a hash map and a hash set
def word_pattern_3(pattern, s):
    words = s.split() # O(NM)
    N = len(pattern)
    if N != len(words):
        return False
    hmap = defaultdict(str) # word --> char
    hset = set()
    for w, c in zip(words, pattern): # O(N)
        if w not in hmap:
            hmap[w] = c
            if c not in hset:
                hset.add(c)
            else:
                return False
        else:
            if hmap[w] != c:
                return False
    return True

def run_word_pattern():
    pattern = "abba" # one-to-one map (bijection map)
    str = "dog cat cat dog"
    print(f"pattern = {pattern}, str = {str}")
    print(f"wp2 = {word_pattern_2(pattern, str)}")
    print(f"wp3 = {word_pattern_3(pattern, str)}")

    pattern = "abba" # one-to-many map (1 char -> 2 words)
    str = "dog cat cat fish"
    print(f"pattern = {pattern}, str = {str}")
    print(f"wp2 = {word_pattern_2(pattern, str)}")
    print(f"wp3 = {word_pattern_3(pattern, str)}")

    pattern = "abbc" # many-to-one map (2 chars -> 1 word)
    str = "dog cat cat dog"
    print(f"pattern = {pattern}, str = {str}")
    print(f"wp2 = {word_pattern_2(pattern, str)}")
    print(f"wp3 = {word_pattern_3(pattern, str)}")

    pattern = "aaaa" # one-to-one map (bijection map)
    str = "dog cat cat dog"
    print(f"pattern = {pattern}, str = {str}")
    print(f"wp2 = {word_pattern_2(pattern, str)}")
    print(f"wp3 = {word_pattern_3(pattern, str)}")

    pattern = "abba" # many-to-one map (2 chars -> 1 word)
    str = "dog dog dog dog"
    print(f"pattern = {pattern}, str = {str}")
    print(f"wp2 = {word_pattern_2(pattern, str)}")
    print(f"wp3 = {word_pattern_3(pattern, str)}")

run_word_pattern()