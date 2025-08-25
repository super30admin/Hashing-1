'''
Anagrams are strings where the order do not matter. 
Each anagram has unique set of letters (repeatable possible). Hence a number which can
be factorized with prime numbers only (eg. 2x5x7 == 5x2x7) and will always be unique
compared to other anagrams. 
Approach: Construct a prime number using prime factors. Each letter from (a-z) has a prime
number mapping. 
Time Complexity: O(N*k) , N = total strings. K=length of largest string | Iterating over all strings
Space Complexity: O(N) + O(26) ~ O(N) , storing strings into anagram_map + prime_nums array storing 26 prime numbers  
'''

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        prime_nums = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        assert len(prime_nums)==26 # 26 alphabets

        anagram_map = {}

        for st in strs:
            mf = 1 # initialize a running multiplying factor
            for ch in st:
                prime_idx = ord(ch)-ord('a') # only lowercase letters mentioned in constraints
                mf = mf*prime_nums[prime_idx] 
            if mf not in anagram_map:
                anagram_map[mf] = [] # New Anagram set found
            anagram_map[mf].append(st) # add the string to it's anagram set

        return list(anagram_map.values()) # return anagram sets   