#Time complexity : O(N)
#Space Complexity: O(N)
#Did the code run in leetcode: Yes


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        #Initializing the variables such as the length of the pattern and the dictionary required for mapping
        length_p = len(pattern)
        pattern_array = s.split(" ")
        length_s = len(pattern_array)

        if (length_p != length_s):
            return False
        mapping_p_s = dict()
        mapping_s_p = dict()
        for i in range(length_p):
            buffer_p = pattern[i]
            buffer_s = pattern_array[i]
#The Element from pattern is mapped to s
            if (mapping_p_s.get(buffer_p) == None):
                mapping_p_s[buffer_p] = buffer_s
            elif (mapping_p_s.get(buffer_p) != buffer_s):
                return False
            else:
                continue
            #Element from s is mapped to pattern
            if (mapping_s_p.get(buffer_s) == None):
                mapping_s_p[buffer_s] = buffer_p
            elif (mapping_s_p.get(buffer_s) != buffer_p):
                return False
            else:
                continue
        return True
