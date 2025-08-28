## Problem 2:
# 205. Isomorphic Strings
# https://leetcode.com/problems/isomorphic-strings/description/

# Given two strings s and t, determine if they are isomorphic.
# Two strings are isomorphic if the characters in s can be replaced to get t.
# All occurrences of a character must be replaced with another character while preserving the order of characters. 
# No two characters may map to the same character but a character may map to itself.

# Example 1:
# Input: s = "egg", t = "add"
# Output: true

# Example 2:
# Input: s = "foo", t = "bar"
# Output: false

# Example 3:
# Input: s = "paper", t = "title"
# Output: true
# Note:
# You may assume both s and t have the same length.

# Method-1: Using 2 Hashmaps
# Time Complexity : O(N)
# Space Complexity : O(2*256) = O(2*Range of ASCII characters) = O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach in three sentences only
# Using Two Hashmaps. First hash map is to check isomorphicity of s -> t. Second hash map is to check isomorphicity of t -> s

class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if(len(s) != len(t)):
            return False

        sMap = {} # to check isomorphicity of s to t
        tMap = {} # to check isomorphicity of t to s

        for i in range(len(s)):
            # to check isomorphicity of s to t
            if(s[i] not in sMap):
                sMap[s[i]] = t[i]
            else:
                if(sMap[s[i]] != t[i]):
                    # s is not isomorphic to t
                    return False

            # to check isomorphicity of t to s
            if(t[i] not in tMap):
                tMap[t[i]] = s[i]
            else:
                if(tMap[t[i]] != s[i]):
                    # s is not isomorphic to t
                    return False

        return True
            

sol = Solution()
print("Method-1:Using 2 Hashmaps")
print(sol.isIsomorphic("egg", "a"))
print(sol.isIsomorphic("e", "a"))
print(sol.isIsomorphic("egg", "add"))
print(sol.isIsomorphic("begg", "cadd"))
print(sol.isIsomorphic("begg", "cadb"))
print(sol.isIsomorphic("begl", "cadd"))


# Method-2: Using 1 Hashmap to check s -> t and one hashset to check t -> s
# Time Complexity : O(N)
# Space Complexity : O(2*256) = O(2*Range of ASCII characters) = O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach in three sentences only
# Using 1 Hashmap and 1 HashSet. Hashmap is to check isomorphicity s -> t and hashset is to check isomorphicity t -> s
# Isomorphic of s -> t is easily checked from hashmap. For isomorphic t -> s, when adding a new entry in smap, 
# we check if c(character in t) has mapping to any other character in s already. 
# That is we need to check if c is already present in current values of smap. If it already exists, 
# it means the same key of t has mapping to two different keys of smap. This is a false case.

class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        # Method-2: Using 1 Hashmap to check s -> t and one hashset to check t -> s
        if(len(s) != len(t)):
            return False

        sMap = {} # to check isomorphicity of s to t
        tSet = set() # to check isomorphicity of t to s

        for i in range(len(s)):
            # to check isomorphicity of s to t
            if(s[i] not in sMap):
                # to check isomorphicity of t to s
                # check if t character is already present in the hashset, ie among the values of the smap
                if(t[i] in tSet):
                    # t character has already been mapped to some other character
                    return False
                sMap[s[i]] = t[i]
            else:
                if(sMap[s[i]] != t[i]):
                    # s is not isomorphic to t
                    return False


            tSet.add(t[i])

        return True
            
sol = Solution()
print("Method-2: Using 1 Hashmap to check s -> t and one hashset to check t -> s")
print(sol.isIsomorphic("egg", "a"))
print(sol.isIsomorphic("e", "a"))
print(sol.isIsomorphic("egg", "add"))
print(sol.isIsomorphic("begg", "cadd"))
print(sol.isIsomorphic("begg", "cadb"))
print(sol.isIsomorphic("begl", "cadd"))      