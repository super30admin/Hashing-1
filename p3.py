#TC= O(n)
#SC = O(1)
# if runs successfully on leetcode: YES


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        #use split on s
        #s.split = ["dog", "cat", "cat", "dog"]

        s_list = s.split()
        if len(pattern) != len(s_list):
            return False
        p_to_s = {}
        s_to_p = {}
        for i in range(0, len(pattern)):
            if pattern[i] not in p_to_s:
               p_to_s[pattern[i]] = s_list[i] #{a:dog}
            else:
                if p_to_s[pattern[i]] != s_list[i]:
                    return False
            if s_list[i] not in s_to_p:
               s_to_p[s_list[i]] = pattern[i] #{a:dog}
            else:
                if s_to_p[s_list[i]] != pattern[i]:
                    return False
        return True
