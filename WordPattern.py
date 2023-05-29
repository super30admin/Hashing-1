# Time Complexity : O(n)
# Space complexity : O(n), to use all letters in pattern as keys in dictionary
# The code ran on Leetcode
# I am maintaining two dictionary to map the pattern and string. Return False when there is a mismatch between them. (key, value) pairs are added to dictionary when they are seen for the first time.
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        s_map = {}
        p_map = {}
        s_list = s.split(' ')
        
        if len(s_list) != len(pattern): return False

        for a, p in zip(s_list, pattern):
            if a in s_map:
                if s_map[a] != p:
                    return False
            else:
                s_map[a] = p

            if p in p_map:
                if p_map[p] != a:
                    return False
            else:
                p_map[p] = a
                    
        return True
