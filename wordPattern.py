#Time Complexity : O(N)
#Space Complexity : O(K) — where K is the number of words in s, stored in the word_list and dictionaries.
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No

#Approach:  
#I first split the input string s into words manually and checked if each character in the pattern maps one-to-one to each word.
#I used two hash maps to ensure the mapping is consistent in both directions and returned False on any mismatch.

class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        term = ""
        word_list = []

        for i in range(0,len(s)):
            if s[i] != " ":
                term += s[i]
            else:
                word_list.append(term)
                term = ""
            if i == len(s) - 1:
                word_list.append(term)
            
        dict_patterne_s = {}
        dict_s_pattern = {}

        if len(word_list) != len(pattern):
            return False
        
        for i in range(len(pattern)):
            if pattern[i] not in dict_patterne_s:
                dict_patterne_s[pattern[i]] = word_list[i]
            
            elif dict_patterne_s[pattern[i]] != word_list[i]:
                return False

            if word_list[i] not in dict_s_pattern:
                dict_s_pattern[word_list[i]] = pattern[i]
                
            elif dict_s_pattern[word_list[i]] != pattern[i]: 
                return False
            
        return True
        