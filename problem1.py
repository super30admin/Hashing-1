#Space complexity: O(n·k)
#Time complexity: O(n·k·log k)


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dict_anagrams = defaultdict(list)
        for string in strs:
            l_s = list(string)
            l_s.sort()
            sorted_anogram = ''.join(l_s)
            dict_anagrams[sorted_anogram].append(string)
        return [dict_anagrams[i] for i in dict_anagrams]
        