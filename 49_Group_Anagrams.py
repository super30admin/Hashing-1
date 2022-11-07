# Time Complexity : O(N^2)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        str_hash = dict()

        #first 26 primes
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101]

        # we are using the property that the multiplication of primes is unique
        # so we use the multiplication if characters as the key
        # ord(i)-ord('a') -> ascii val of char(i) - ascii val of 'a'
        # it gives us the index of char(i) relative to zero to fetch from the prime list
        for elem in strs:
            key = 1
            for i in elem:
                key *= primes[ord(i)-ord('a')]
            if key not in str_hash:
                str_hash[key] = list()
            str_hash[key].append(elem)
        return list(str_hash.values())

        # Here the time complexity is O(N * KlogK) as we are using the sorted string as key
        # KlogK for sorting the string
#         str_hash = dict()
#         for elem in strs:
#             sort_elem = ''.join(sorted(elem))
#             if sort_elem not in str_hash:
#                 str_hash[sort_elem] = list()
#             str_hash[sort_elem].append(elem)
#         return list(str_hash.values())