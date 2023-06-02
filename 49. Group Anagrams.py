# // Time Complexity : O(NK)
# // Space Complexity : O(N)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]: #This will check of the prime product of word is there in dictionary. If it is It'll add the word to it.
        if strs is None or len(strs) == 0:
            return []
        anagrams = {}
        for word in strs: #Going over n words
            prime_product = self.primeProduct(word)
            if prime_product in anagrams:
                anagrams[prime_product].append(word)
            else:
               anagrams[prime_product]= [word]
        return list(anagrams.values())
        
    def primeProduct(self, s): #Function to calculate prime product of a word
        result = 1
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47,53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        for i in range(len(s)): #Going over each word (k)
            c = s[i]
            result = result* primes[ord(c)-ord('a')]
        return result


    