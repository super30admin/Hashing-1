# Group Anagrams
# Time Complexity : O(log(mn) | where n in the number of words and m is the average length of words
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagram_map = {}
        for word in strs:
            tup = [0]*26
            for ch in word:
                tup[ord(ch) - ord('a')] += 1
                
            tup = tuple(tup)
            if tup in anagram_map:
                anagram_map[tup].append(word)
            else:
                anagram_map[tup] = [word]
                
        return anagram_map.values()
        

# Isomorphic Strings
# Time Complexity : O(n) | where n is the length of the string
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        smap = {}
        tmap = {}
        
        if len(s) != len(t):
            return False
        
        for i in range(len(s)):
            if s[i] in smap:
                if smap[s[i]] != t[i]:
                    return False
            else:
                smap[s[i]] = t[i]
            
            if t[i] in tmap:
                if tmap[t[i]] != s[i]:
                    return False
            else:
                tmap[t[i]] = s[i]
                               
        return True
                       
# Word Pattern
# Time Complexity : O(n) | length of pattern string
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        pmap = {}
        wmap = {}
        
        words = s.split()
        
        if len(pattern) != len(words):
            return False
            
        for i in range(len(pattern)):
            
            if pattern[i] in pmap:
                if pmap[pattern[i]] != words[i]:
                    return False    
            else:
                pmap[pattern[i]] = words[i]
               
            
            if words[i] in wmap:
                if wmap[words[i]] != pattern[i]:
                    return False          
            else:
                wmap[words[i]] = pattern[i]
                
        return True
            