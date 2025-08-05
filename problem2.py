#Time Complexity : O(n)
#Space Complexity : O(1)
#Any problem you faced while coding this : was confused with what to return, was sorted out 

#Your code here along with comments explaining your approach
class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        my_hash_map={}              # to store the mapping
        my_hash_set=set()           # to make sure that there is unique mapping
        for char_s, char_t in zip(s,t):
            if char_s in my_hash_map:       # if there is already a mapping and is not equal to the current mapping then return False
                if my_hash_map[char_s]!=char_t:
                    return False
            else:                           # if not check if there is mapping already present in the hash set if so return False
                if char_t in my_hash_set:
                    return False
                else:
                    my_hash_map[char_s]=char_t  # store the mapping in the hashmap
                    my_hash_set.add(char_t)     #store in the hashset to indicate it is already mapped to a value for the future ref
        return True 
        