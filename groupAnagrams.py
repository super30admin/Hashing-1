# Run Time complexity: O(NK)
# Space: O(NK)
# did it run on leetcode: yes
# any issue sfaced: none
#grouping anagrams based on product of primes mapped to each lowercase letter. tuple of counts of each lowercase letter can also be used as the key for grouping.
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        ans = collections.defaultdict(list)
        for str in strs: #O(n)
            prod = 1
            for s in str: #O(k)
                prod*=primes[ord(s)-ord('a')]
            ans[prod].append(str)
        return ans.values()

    def getPrimes():
        count, primes, num = 26, [0 for _ in range(26)], 1
        for i in range(26):
            num += 1
            divisor = 2
            while divisor <= num//2:
                if num % divisor == 0:
                    num += 1
                    divisor = 2
                else:
                    divisor += 1
            else:
                primes[i] = num