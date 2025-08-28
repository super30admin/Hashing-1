"""
Time Complexity : O(N*K)

Space Complexity : O(N*K)

"""

class Solution:

    def getPrimeProduct(self, s): 
        
        FIRST_26_PRIMES = [
        2,  3,  5,  7, 11, 13, 17, 19, 
        23, 29, 31, 37, 41, 43, 47, 53, 
        59, 61, 67, 71, 73, 79, 83, 89, 
        97, 101
        ]

        res = 1

        for ch in s: 
            number = ord(ch) - ord('a')
            prime_number = FIRST_26_PRIMES[number]
            res*=prime_number

        return res



    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        # def prime_prod(s): 

        mp = collections.defaultdict(list)

        for s in strs: 
            p = self.getPrimeProduct(s)
            mp[p].append(s)
        
        return list(mp.values())
