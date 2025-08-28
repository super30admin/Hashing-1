# Time Complexity : O(n * k)
#   n = number of strings in the input list
#   k = average length of a string
#   We compute a key for each string in O(k) and do this n times.
#
# Space Complexity : O(n * k)
#   We store all strings in the hash map buckets and the final answer.
#   (Keys are integers; the dominant space is the output groups holding all strings.)
#
# Did this code successfully run on Leetcode : Yes
#
# Any problem you faced while coding this :
#   - Accidentally using float (1.0) instead of int (1) for the product can cause precision issues.
#   - Assumes lowercase 'a'..'z'. If input can have uppercase/non-letters, normalize first.
#   - In other languages with fixed-size integers, the product could overflow; Python ints are safe.
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # groups maps: prime-product key (int) -> list of anagram strings
        groups = defaultdict(list)
        # Go through each word and place it in the correct bucket
        for word in strs:
            key = self._prime_product(word) # compute the anagram signature as an integer
            groups[key].append(word) # add the word to its matching group
        # We only need the grouped lists as the final answer
        return list(groups.values())

    def _prime_product(self, word: str) -> int:
        # One unique prime for each lowercase letter 'a'..'z'
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43,
                  47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        product = 1
        # Multiply the prime corresponding to each character.
        # Because prime factorization is unique, anagrams (same letters) get the same product.
        for ch in word:
            # ord('a') is used to map 'a'..'z' to indices 0..25
            product *= primes[ord(ch) - ord('a')]
        return product


