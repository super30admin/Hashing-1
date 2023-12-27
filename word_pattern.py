#Time complexity: O(n)
#Space complexity:O(1)

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        # Two Hashmap solution
        str_array = s.split(" ")

        if len(pattern) != len(str_array):
            return False

        p_map = {}
        s_map = {}

        for i in range(len(pattern)):
            p_char = pattern[i]
            str_word = str_array[i]

            if p_char in p_map:
                if str_word != p_map[p_char]:
                    return False
            else:
                p_map[p_char] = str_word

            if str_word in s_map:
                if s_map[str_word] != p_char:
                    return False
            else:
                s_map[str_word] = p_char

        return True
