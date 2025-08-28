## Problem 1:
# LC-49. Group Anagrams
# https://leetcode.com/problems/group-anagrams/description/

# Given an array of strings, group anagrams together.

# Example:
# Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
# Output:
# [
#   ["ate","eat","tea"],
#   ["nat","tan"],
#   ["bat"]
# ]

# Note:
# All inputs will be in lowercase.
# The order of your output does not matter.

# Method-1: Brute Force
# N - size of array
# K - average size of each word
# Time Complexity : O(N*KLogK)
# Space Complexity : O(N*K) -- For each word we taking space to store the sorted word
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach in three sentences only
# We iterate through the main array. For each word, we sort it and check if key exists in our hashmap. We maintain a hashmap with
# key as sorted word and a list of words having that sorted key, as value for each key

class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        # Method1: Brute force
        # Sort words and keep sorted word as the key
        anagrams = {}

        for word in strs:# TC: O(N)
            sortedWord = sorted(list(word)) # TC:O(KlogK)
            sortedString = ''.join(sortedWord)
            if(sortedString not in anagrams): # TC:O(K) -- to check if a string key exists in hashmap, for its hashfunction it has to go through each character of the string. But this is a lower order terms.
                anagrams[sortedString] = []
            (anagrams[sortedString]).append(word)

        # would return list of values of the hashmap
        # and values are list itself of grouping of anagrams based
        # on sorted keys
        return anagrams.values()
    
sol = Solution()
print("Method-1: Brute Force Using Sorted Keys")
print(sol.groupAnagrams(["eat","tea","tan","ate","nat","bat"]))
print(sol.groupAnagrams([""]))
print(sol.groupAnagrams(["",""]))
print(sol.groupAnagrams(["a"]))


# Method-2: Optimal
# Using prime products as keys to remove sorting
# N - size of array
# K - average size of each word
# Time Complexity : O(N*K) -- For each word we go through each character to get the prime product
# Space Complexity : O(N*K) -- If we have N unique keys and each word is of max length K. So storing 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach in three sentences only
# Here for each word, we calculate the prime product, treating each lower case character with a unique prime number.
# This would mean eg: ad - 2*7, bc - 3*5 would always have a different value. But (ad, da) or (team, mate) that is words with similar
# letters would always have same prime products and hence we would have collisions. Bu these are Anagrams. So it is good for us that 
# whenever collision happens, it means that it would be anagram of the string and we can append to the value list, keeping the unique
# prime products as keys. This helps to eliminate sorting

class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        # Method2: Optimal
        # Using prime products as keys to remove sorting
        def getPrimeProduct(word):#O(K)
            if(not word):
                return 0
            
            # Since we have lowercase characters a-z
            # We can map each of these to a unique prime number
            # they can be any
            primeNums = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
            
            primeProduct = 1
            for i in word:
                primeProduct *= primeNums[ord(i) - ord('a')]

            return primeProduct
            


        anagrams = {}

        for word in strs:# O(N)
            productKey = getPrimeProduct(word)#O(K)
            if(productKey not in anagrams): #O(1) -- to check if a integer key exists in hashmap, for its hashfunction it would be O(1).
                anagrams[productKey] = []
            (anagrams[productKey]).append(word)

        # would return list of values of the hashmap
        # and values are list itself of grouping of anagrams based
        # on sorted keys
        return anagrams.values()
        
sol = Solution()
print("Method-2: Optimal Using prime products as keys to remove sorting")
print(sol.groupAnagrams(["eat","tea","tan","ate","nat","bat"]))
print(sol.groupAnagrams([""]))
print(sol.groupAnagrams(["",""]))
print(sol.groupAnagrams(["a"]))

