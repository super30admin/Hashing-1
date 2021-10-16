#Time Complexity: O(n)
#Space Complexity: O(n)
#Problem sucessfully accepted in leetcode: yes

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashmap={}
        for i in range(len(strs)):
#Get the key from prime product hasing function
            key = self.hashing(strs[i])
#If the key is present, add the str word to its group of anagrams
            if key in hashmap:
                hashmap[key].append(strs[i])
#If not present, create new entry
            else:
                hashmap[key]=[strs[i]]
#Add all the anagram groups from hashmap into a list
        strs=[]
        for s in hashmap:
            strs.append(hashmap[s])
        return strs
                
                
        
    def hashing(self, key):
#Product  of primes will be same for anagrams, irrespective of order of letters
#create list of first 26 prime numbers, corresponding to 26 alphabets
        prime = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        prod = 1
#Find the prime number corresponding to each character in sting, and find product of primes for entire word
        for c in key:
            prod*=prime[ord(c)-ord('a')]
        return prod