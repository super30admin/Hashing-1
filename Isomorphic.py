# Time Complexity: O(n), n is the length of the string
#  Space Complexity: O(1); as 256 max keys are possible for the hashmap
#   Successful Run on Leetcode: yes
    '''
    we create a mapping for string from s to t and viceversa and check if the key and value are mapped correctly
    '''


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        mapST = dict()
        mapTS = dict()
        
        for c1, c2 in zip(s,t):
            
            if (c1 not in mapST) and (c2 not in mapTS):
                mapST[c1] = c2
                mapTS[c2] = c1
            elif mapST.get(c1) != c2 or mapTS.get(c2) != c1:
                return False
        return True
