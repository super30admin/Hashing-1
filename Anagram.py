# Time Complexity: O(N * K), N is the number of words in the array and K is the length of each word
# Space Complexity: O(N), N is the number of words in the array
# Did this code successfully run on Leetcode: Yes


# Your code here along with comments explaining your approach

# I am maintaining a prime map, where each alphabet is mapped to a prime number
# for every word, prime product is computed and it is inserted into the hash map



class Solution(object):
    prime_map = {
        "a": 2,
        "b": 3,
        "c": 5,
        "d": 7,
        "e": 11,
        "f": 13,
        "g": 17,
        "h": 19,
        "i": 23,
        "j": 29,
        "k": 31,
        "l": 37,
        "m": 41,
        "n": 43,
        "o": 47,
        "p": 53,
        "q": 59,
        "r": 61,
        "s": 67,
        "t": 71,
        "u": 73,
        "v": 79,
        "w": 83,
        "x": 89,
        "y": 97,
        "z": 101
    }

    def find_prime_product(self, word):
        prime_product = 1

        for char in word:
            prime_product *= self.prime_map[char]
        
        return prime_product


    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        hash_map = {}

        for word in strs:
            prime_product = self.find_prime_product(word)
            if prime_product in hash_map:
                hash_map[prime_product].append(word)
            else:
                hash_map[prime_product] = [word]
        
        return hash_map.values()