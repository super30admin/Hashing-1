#Time Complexity :  O(nk)
#Space Complexity : O(nk)
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No


#sorting the strings and storing it in hashmap O(n * klogk) time complexity
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if not strs or len(strs) == 0:  #base case check
            return []
        
        hashmap = {}                    #creating hashmap
        
        for s in range(len(strs)):
            c = strs[s]                                 
            sortedStr = ''.join(sorted(strs[s]))    #sorting the string
            if sortedStr not in hashmap.keys():     #if sorted string not in hashmap 
                hashmap[sortedStr] = []             #we add it as the key and value will be an empty list
            hashmap[sortedStr].append(c)            #we add the input string to that list containing sortedStr
        return hashmap.values()


#using prime product O(nk) time and space
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if not strs or len(strs) == 0:              #base case check
            return []
        
        hashmap = {}                                #creating hashmap
        
        for s in range(len(strs)):
            c = strs[s] 
            primeProduct = self.primeProduct(c)        #calculate prime product
            if primeProduct not in hashmap.keys():     #if prime product not in hashmap 
                hashmap[primeProduct] = []             #we add it as the key and value will be an empty list
            hashmap[primeProduct].append(c)            #we add the input string to that list containing primeproduct as key
        return hashmap.values()

    
    def primeProduct(self, s):
        prime = [2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103]
        result = 1
        for i in range(len(s)):
            sChar = s[i]
            result = result * prime[ord(sChar)-ord('a')]
        
        return result