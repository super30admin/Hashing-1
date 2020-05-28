# ************************** Group Anagrams ***********************************************


# Time Complexity : O(nk logk) n is the number of strings and k is the max characters of strings
# Space Complexity : O(nk)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# 
# Used dictionary to store the values of the tuple.

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if not strs:
            return []
        
        d = collections.defaultdict(list)
        for i in strs:
            d[tuple(sorted(i))].append(i)
        return d.values()
        
#Second Approach:

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if not strs:
            return []
        
        d = collections.defaultdict(list)
        for s in strs:
            count = [0]*26
            for c in s:
                count[ord(c)-ord('a')] +=1
            d[tuple(count)].append(s)
        return d.values()
        

# **********************************  Isomorphic Strings   **************************************************************

# Time Complexity : O(n) n is the number of characters of strings
# Space Complexity : O(2n) Dictionary and set
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# 
# Used dictionary to store the mapped pairs and a set to store the already mapped characters.
        
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        d = {}
        mapped= set()
        for i,j in zip(s,t):
            if i in d:
                if d[i]!=j:
                    return False
            elif j in mapped:
                return False
            else:
                d[i] = j
                mapped.add(j)
        return True

# *************************************** WordPattern ************************************************      

# Time Complexity : O(n) n is the number of characters of strings in pattern
# Space Complexity : O(n) Dictionary and set
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# 
# Used dictionary to store the mapped pairs.    
    
class Solution:
    def wordPattern(self, pattern: str, str: str) -> bool:
        s = str.split(' ')

        if len(pattern) != len(s) or len(set(pattern)) != len(set(s)) or not pattern or not s:
            return False
        
        d = {}
        for i,j in zip(pattern,s):
            if i in d:
                if d[i] != j:
                    return False
            else:
                d[i] = j
        return True