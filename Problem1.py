import defaultdict

class Solution(object):
    def groupAnagrams(self, strs):
        """
        For each word, count the number of letters that occur and
        Use the count in a tuple as a key
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        anagram_map = defaultdict(list)

        for s in strs:
            count = [0] * 26
            for char in s:
                count[ord(char) - ord("a")] += 1

            anagram_map[tuple(count)].append(s)
        return anagram_map
