# Time Complexity: O(nklogk); n is size of the list, k is the average length of the string in the list
# Space Complexity: O(n); for hash map
# Successful run on leet code: yes
  '''
  we do the prime product of the letter in the string and use that as a key for the hashmap, the respective anagram will also have same key value 
  which are grouped and returned
  '''

class Solution:
    def primeProduct(self, str):
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 67, 71, 73, 79, 83, 89, 97, 101, 103]
        res = 1
        for i in range(len(str)):
            res *= primes[ord(str[i])-ord('a')]
        return res
        
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        subRes = dict()
        
        for s in strs:
            primeP = self.primeProduct(s)
            if primeP not in subRes:
                subRes[primeP] = []
            subRes[primeP].append(s)
        return list(subRes.values())
        
