'''
Time complexity: O(n)
Space complexity: O(n)

Approach is to have a mask for the string for example 
treat would have [0,1,2,3,0] where t is repeated twice,
bread would have [0,1,2,3,4] which means these two words are not isomorphic.
'''

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        return self.mask(s)==self.mask(t)
    
    def mask(self, text:str):
        d = {}
        mask = []
        for i in range(len(text)):
            if text[i] in d:
                mask.append(d[text[i]])
            else:
                d[text[i]] = i
                mask.append(i)

        return mask