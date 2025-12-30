# Problem 1: https://leetcode.com/problems/group-anagrams/
# Time Complexity : N k log k
# Space Complexity : O(nk)
# Did this code successfully run on Leetcode :yes
# Any problem you faced while coding this :no

class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        ## the problem to is group words with same anagrams
        ## meaning the words with the same anagrams are going to have same number of chars in a string
        ## we can start by iterating over the word one by one and sorting it
        ## the reason to choose hashmap here is because we need to search the sorted key again and again and hashmap gives O(1) while search key
        ## the hashmap will contain the sorted word as key and corresponding value will be a list of words. 
        ## if we find the key in hashmap then append to the list, else add a new key and val to the map
        ## return the hashmap.value since it will list of list with all the groupings
        hashmap = {}

        for s in strs:
            
            sorted_key = tuple(sorted(s))
            if sorted_key in hashmap.keys():
                l = hashmap.get(sorted_key)
                l.append(s)
            else:
                hashmap[sorted_key] = [s]
        
        return hashmap.values()




#################################################
# Problem 2: https://leetcode.com/problems/isomorphic-strings/
# Time Complexity : O(N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode :yes
# Any problem you faced while coding this :no


class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        ## the intution here - we need to check if we have mapped a char with some char if yes we can change the mapping
        ## if the condition is true for all the char in s and t then it is isomorphic else it is not
        ## now if I try to do this with only one map, I can't do this reason being, I can check what s keys are mapped to wrt t but not vice versa 
        ## to be able to see the t to s mapping also I need to maintain a new hashmap
        ## Check if the value already exists in map if yes get and check if it is same to the new mapping we have in hand
        ## if not return false else continue with the process
        ## do similar for t and return true at very end if process completes 


        s_map = {}
        t_map = {}

        for i in range(0,len(s)):
            if s[i] in s_map and s_map.get(s[i]) != t[i]:
                return False
            else:
                s_map[s[i]] = t[i]
            
            if t[i] in t_map and t_map.get(t[i]) != s[i]:
                return False
            else:
                t_map[t[i]] = s[i]
        return True            



#################################################
# Problem 3: https://leetcode.com/problems/word-pattern/description/
# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode :yes
# Any problem you faced while coding this :no



## the intution here - we need to check if we have mapped a char with some char if yes we can change the mapping
## if the condition is true for all the char in s and t then it is isomorphic else it is not
## now if I try to do this with only one map, I can't do this reason being, I can check what s keys are mapped to wrt t but not vice versa 
## to be able to see the t to s mapping also I need to maintain a new hashmap
## Check if the value already exists in map if yes get and check if it is same to the new mapping we have in hand
## if not return false else continue with the process
## do similar for t and return true at very end if process completes 


class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        p_map = {}
        s_map= {}
        words = s.split()
        
        if len(pattern) != len(words):
            return False

        for i in range(0,len(words)):
            if pattern[i] in p_map and p_map.get(pattern[i]) != words[i]:
                return False
            else:
                p_map[pattern[i]] = words[i]
            
            if words[i] in s_map and s_map.get(words[i]) != pattern[i]:
                return False
            else:
                s_map[words[i]] = pattern[i]
        return True
