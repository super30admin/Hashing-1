#time complexity:o(n*k) where n is size of orig arr and k is size of each string
#space complexity: o(1) 
#passed all cases on LeetCode: yes
#difficulty faced: ascii value of chars need to use ord function
# comments:in the code
#https://leetcode.com/problems/group-anagrams/

class Solution:
    def groupAnagrams(self, strs: 'List[str]') -> 'List[List[str]]':
        
        #dictionary/hash map where key is int/double and value has array of strings
        maps_ar = {}
        
        #product of prime numbers is always unique so we want that as key instead of sorting every string and so klogk becomes k
        #ord returns ascii value 
        def helper(str1):
            primes = [2, 3, 5, 7, 11 ,13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 107]
            result = 1
            for i in range(0,len(str1)):
                c = str1[i]
                #sub ascii value of char - ascii value of a to get index in above arr
                result = result*primes[ord(c)-ord('a')]
            return result
        
        
        for i in range(0,len(strs)):
            str1 = strs[i]
            primeprod = helper(str1)
            if primeprod not in maps_ar:
                #create an arr at this idx and add the string
                maps_ar[primeprod] = []
            maps_ar[primeprod].append(str1)
        
        return maps_ar.values()
            
        
        
        
       
        
            