class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        # Time complexity O(N)
        # Space complexity O(M). M is number of unique words in s
        pattern_map = {}
        s_map = {}
        s_list = s.split()
        pattern_list = list(pattern)

        if len(s_list) == len(pattern_list):
            for i in range(len(s_list)):
                if s_list[i] not in s_map and pattern_list[i] not in pattern_map:
                    s_map[s_list[i]] = pattern_list[i]
                    pattern_map[pattern_list[i]] = s_list[i]

                elif s_map.get(s_list[i]) != pattern_list[i] or pattern_map.get(pattern_list[i]) != s_list[i]:
                    return False
                '''
                elif s_list[i] in s_map and s_map[s_list[i]] != pattern_list[i]:
                    return False

                elif s_list[i] not in s_map and pattern_list[i] in pattern_map:
                    return False
                '''

            return True
        else:
            return False
