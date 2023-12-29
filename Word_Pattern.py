""" Explanation: I broke the string s down into separate characters and then made each character a key in the hash map. Then the words from
    the pattern were the stored as values for those keys. Then I just map the keys to the values and check if a key has already been 
    assigned to the value.
    Time Complexcity: O(n) where n is the number of words in the pattern
    Space Complexcity: O(n)
"""



class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        char_in_s = s.split()
        len_pattern = len(pattern)
        len_char = len(char_in_s)

        if len_pattern != len_char:
            return False
        
        # initialize a dict to store the chars as the key and the words from the pattern as the value
        pattern_dict = {}
        for key,value in zip(pattern,char_in_s):
            if(key in pattern_dict and value!= pattern_dict[key]):
                return False
            pattern_dict[key] = value
            if len(set(pattern_dict.values())) != len(set(pattern_dict.keys())):
                return False
        return True
        