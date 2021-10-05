"""
Time Complexity: O(m*n) where m is the length of the words in array strs
Space Complexity : O(n)
Did your  code run on leetcode?: yes
Issues faced: coming up with the equation for result in Calculate function
"""
class Solution:
    def groupAnagrams(self, strs):
        hashmap = {}

        for i in range(len(strs)):
            # temp = strs(i]
            PrimeKey = self.Calculate(strs[i])
            # print(PrimeKey)
            if PrimeKey not in hashmap.keys():
                hashmap[PrimeKey] = []
                hashmap[PrimeKey].append(strs[i])
            else:
                hashmap[PrimeKey].append(strs[i])
        return hashmap.values()




    def Calculate(self,s):
        Primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101]
        result = 1
        for x in range(len(s)):
            ascii = ord(s[x])
            result = result * Primes[ascii - ord("a")]
        return result
if __name__ == '__main__':
    Anagram = Solution()
    print(Anagram.groupAnagrams(["eat","tea","tan","ate","nat","bat"]))
