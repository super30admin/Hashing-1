# LEETCODE PROBLEM 49. GROUP ANAGRAMS
# TIME COMPLEXITY: 
#   Approach 1: O(N * Klog K) where N is the number of elements and K is the length of a string
#   Approach 2: O (N * K) where N is the number of elements and K is the length of a string
# SPACE COMPLEXITY: O (1)
# Any problem you faced while coding this:  Had issue in implementing the logic for the 2nd approach

class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        #Approach 1
        #Hashing Approach
        hashmap={}
        for string in strs:
            sorted_string=''.join(sorted(string))
            if sorted_string not in hashmap:
                hashmap[sorted_string]=[]
            hashmap[sorted_string].append(string)
        return list(hashmap.values())
    
        #Approach 2
        #Prime Numbers Approach

    #     map=defaultdict(list)
    #     for string in strs:
    #         hash=self.getHash(string)
    #         map[hash].append(string)
    #     return list(map.values())
    
    # def getHash(self,string):
    #     primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43,47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
    #     hash=1
    #     for c in string:
    #         hash*=primes[ord(c)-ord('a')]
    #     return hash


        