# Time Complexity : O(nk)
# Space Complexity : O(nk)
# Did this code successfully run on Leetcode : Yes

class Solution(object):
    def groupAnagrams(self, strs):
        if len(strs) == 0:
            return []
        group_anagram_map = {}
        for i in range(len(strs)):
            prime_product = self.prime_product(strs[i])
            if prime_product not in group_anagram_map:
                group_anagram_map[prime_product] = []
                group_anagram_map[prime_product].append(strs[i])
            else:
                group_anagram_map[prime_product].append(strs[i])
        return group_anagram_map.values()
    
    def prime_product(self, strs):
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        prime_prod = 1
        for i in range(len(strs)):
            char = strs[i]
            prime_prod = prime_prod * primes[ord(char) - ord('a')]
        return prime_prod
    
#obj = Solution()
#sol1 = obj.groupAnagrams(["eat","tea","tan","ate","nat","bat"])
#print(sol1)
#sol2 = obj.groupAnagrams([""])
#print(sol2)
#sol3 = obj.groupAnagrams(["a"])
#print(sol3)