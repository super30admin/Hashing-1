# Time : O(n*k), where n is the number of strings and k is the length of the string.]
# Space: O(n*k), where n is hashmap keys/groups storage for strings and k is the length of the string.

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        hashmap = {}

        for string in strs:
            string_hash = self.get_hash(string)

            if string_hash not in hashmap:
                hashmap[string_hash] = [string]
            else:
                hashmap[string_hash].append(string)

        return list(hashmap.values())


    def get_hash(self, s: str) -> int:
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43,
                  47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]

        generate_hash = 1
        for c in s:
            generate_hash *= primes[ord(c) - ord('a')]

        return generate_hash
