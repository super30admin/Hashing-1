#https://leetcode.com/problems/group-anagrams/description/
#Did it run on LeetCode: Yes
# TC: O(N * K) where N = number of words, K = max word length; loop runs N times, computing hash for each word costs K (just multiplying, no sorting)
# SC: O(N * K) where storing all N words of max length K in the dictionary
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        map = defaultdict(list)          # key=hash number, value=list of anagrams

        for str in strs:                # go through every word
            hash = self.getHash(str)    # get unique prime product for this word
            map[hash].append(str)       # add word to its group

        return list(map.values())        # return all groups

    def getHash(self, str: str) -> int:
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43,47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]

        hash = 1                               # start at 1
        for c in str:                           # for each character
            hash *= primes[ord(c) - ord('a')]    # multiply by its prime
        return hash                              # return final product