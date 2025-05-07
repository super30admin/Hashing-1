class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        '''O(n) Time complexity
            O(n) space complexity'''
        
        
        #creating an array of prime numbers
        
        
        prime_array=[2,3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101,103]
        
            
        #prime product for strings function
        def prime_product(s):
            result=1
            for i in range(len(s)):
                
                result*=prime_array[ord(s[i])-ord('a')]
                
            return result
        #initialize hashmap
        hash_map={}
        #iterate through the array,and calculate prime product of each word and map words with same product to the same array.
        for i in range(len(strs)):
            product=prime_product(strs[i])
            
            if product not in hash_map:
                
                hash_map[product]=[strs[i]]
            else:
                
                hash_map[product].append(strs[i])
        
        
        return hash_map.values()
                
            
        
        