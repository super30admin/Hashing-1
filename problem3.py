#Time Complexity : O(n)
#Space Complexity : O(1)
#Any problem you faced while coding this : None

#Your code here along with comments explaining your approach
class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        my_hash_map={}   #to store the mapping between the two
        my_hash_set=set() # to make sure that the mapping is unique
        words_List=s.split(' ')
        if len(pattern)!=len(words_List): # if the length is not equal return False
            return False
        for c,word in zip(pattern,words_List): 
            if c in my_hash_map:
                if my_hash_map[c]!=word: # if it is already mapped and is different then return False
                    return False
            else:
                if word in my_hash_set:  # if not mapped yet, but to make sure it is unique check the hashset
                    return False         # if it is present return False
                else:
                    my_hash_map[c]=word   # else store the mapping
                    my_hash_set.add(word)  # add the value to hashset to check in the future that it is not mapped to something else 
        return True 