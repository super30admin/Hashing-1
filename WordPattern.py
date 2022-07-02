# Time Complexity : O(N) //As it would run N number of time the words present
#  Space Complexity : O(N) //It would run for N letter present in dictionary
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this : N/A

#  Your code here along with comments explaining your approach
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        #Define a dictionary for hashMap and split the words in the s to maintain parity of lengths
        dictWord = {}
        words = s.split()
        if len(pattern) != len(words):
            return False
        
        #Populating the hashmap and checking with its values if there is element already present and not eaual to the word if yes the return false
        for i in range(len(pattern)):
            if pattern[i] in dictWord:
                if dictWord[pattern[i]] != words[i]:
                    return False
            else:
                if words[i] in dictWord.values():
                    return False
                dictWord[pattern[i]] = words[i]
                
        return True