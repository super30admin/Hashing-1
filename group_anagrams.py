'''
49 Group Anagrams
https://leetcode.com/problems/group-anagrams/description/

Given an array of strings, group anagrams together.

Example: Input: ["eat", "tea", "tan", "ate", "nat", "bat"], Output: [ ["ate","eat","tea"], ["nat","tan"], ["bat"] ]

Note: All inputs will be in lowercase. The order of your output does not matter.

Let N = no of words in the input list, M = len of longest word

Solution:
1. Brute Force: For each word in array, sort the chars. Treat the sorted char
array as the key in a hash map with the value being the word itself. Do this for each word. If for any word, the key already exists in the hash map, append
this word to the value. In other words,
map = {} // hash map with key = string, value = empty list
for i = 0:N-1: # O(N)
    word = array[i]
    char_arr = sorted(word) # M log M
    if char_arr not in map: # O(1)
        map[char_arr] = []
    map[char_arr].append(word)
return list(map.values())
Time: O(NM log M), Space: O(NM)

Why is space O(NM)? We could potentially have a case where there are
no anagrams in the input array of strings which results in a hash table of
size O(N). Each word takes up O(M) space.


2. Frequency count as hash map key: For each word, count the frequency of each character in the word to generate a 26-length key. Use the key to store the word in a hashmap.
Time: O(NM), Space: O(NM)

3. Prime factorization hashing: Mapping each letter of a word to a unique prime number and multiplying them together to create a unique hash key is called prime-product hashing (or prime factorization hashing).
Create a character to prime number map (a: 1, b:2, c:3, d:5, e:7, ...). For each char in word, get the ASCII value of char and its corresponding prime number and compute the prime product. Do this for each char in the word
and sum the prime products. Use the resulting sum as the key to store the word in a hashmap. Caveat: prime product might result in integer overflow
Key Mathematical property: Product of two prime numbers is unique
Time: O(NM), Space: O(NM)

https://www.youtube.com/watch?v=PR4lOSZv7w0

'''
from collections import defaultdict

# Solution 1: sorted characters in word as key in hash map
def group_anagrams_1(W):
    h = defaultdict(list)
    for w in W: # O(N)
        key = ''.join(sorted(w)) # O(M log M)
        h[key].append(w)
    return list(h.values())


# Solution 2: freq count as key in hash map
def make_array_of_character_counts(w):
    arr = [0]*26
    for c in w: # O(M)
        arr[ord(c) - ord('a')] += 1
    key = "".join(map(str, arr))
    return key

def group_anagrams_2(W):
    h = defaultdict(list)
    for w in W: # O(N)
        key = make_array_of_character_counts(w) # O(M)
        h[key].append(w)
    return list(h.values())

# Solution 3: Prime factorization hashing
def prime_product(str):
    primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43,
        47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]

    key = 1.0
    for c in str:
        key *= primes[ord(c) - ord('a')]
    return key

def group_anagrams_3(W):
    h = defaultdict(list)
    for w in W: # O(N)
        key = prime_product(w) # O(M)
        h[key].append(w)
    return list(h.values())

def run_group_anagrams():
    W = ["eat", "tea", "tan", "ate", "nat", "bat", "listen", "cinema", "dad", "triangle", "add", "silent", "integral", "anemic", "altering", "a"]
    print(f"List of words = {W}")
    print(f"Grouped anagrams 1: {group_anagrams_1(W)}")
    print(f"Grouped anagrams 2: {group_anagrams_2(W)}")
    print(f"Grouped anagrams 3: {group_anagrams_3(W)}")

run_group_anagrams()
