class Solution:
    # // Time Complexity : O(N) for show and size, rest O(1)
    # // Space Complexity : O(N) for storing the elements in the stack
    # // Did this code successfully run on Leetcode : Not on LC
    # // Any problem you faced while coding this : No

    # Implementing a stack using a singly linked list. Basic operations such as push, pop,
    # peek are implemented with O(1) complexity, while show and size have O(N) complexity.

    def isIsomorphic(self, s: str, t: str) -> bool:
        mapping_s_to_t, mapping_t_to_s = {}, {}

        for index in range(len(s)):
            char_s, char_t = s[index], t[index]

            if ((char_s in mapping_s_to_t and mapping_s_to_t[char_s] != char_t) or
               (char_t in mapping_t_to_s and mapping_t_to_s[char_t] != char_s)):
                return False

            mapping_s_to_t[char_s] = char_t
            mapping_t_to_s[char_t] = char_s

        return True
