#Time Complexity : O(n)
#Space Complexity : O(n)
#Any problem you faced while coding this : none

#Your code here along with comments explaining your approach

class Solution(object):
    def calHash(self,str):    # to cal hashValue of the string
        primes=[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101] # first 26 prime nos
        val_hash=1
        for s in str:
            val_hash*=primes[ord(s) - ord('a')]
        return val_hash
    
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        my_hashMap={}
        for s in strs:
            hashVal=self.calHash(s)  # once you get the hash Value of the string check of it is already in the Hashmap 
            if hashVal in my_hashMap:
                my_hashMap[hashVal].append(s)    # if present append the string 
            else:
                my_hashMap[hashVal]=[s]          # if not present add the value
    
        return list(my_hashMap.values())         # return the list of all the strings that map to the same hash value