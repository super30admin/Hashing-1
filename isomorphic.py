#Time complexity : O(N)
#Space Complexity: O(N)
#Did the code run in leetcode: Yes
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        len_s = len(s)
        #Creating two mapping for S->T and T->S
        mapping_s_t = dict()
        mapping_t_s = dict()
        for i in range(len_s):
            buffer_s = s[i]
            buffer_t = t[i]
            #Checking if the mapping exist or inserting in the location or if the element already exist with the value then returning false
            if (mapping_s_t.get(buffer_s) == None):
                mapping_s_t[buffer_s] = buffer_t
            elif (mapping_s_t.get(buffer_s) != buffer_t):
                return False
            #checking the same condition for T->S mapping
            if (mapping_t_s.get(buffer_t) == None):
                mapping_t_s[buffer_t] = buffer_s
            elif (mapping_t_s.get(buffer_t) != buffer_s):
                return False
        return True
