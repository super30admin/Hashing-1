#TC = o(N)
class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        stringMap = {}

        for word in strs:
            sorted_word = "".join(sorted(word))
            if sorted_word not in stringMap:
                stringMap[sorted_word] = [word]
            else:
                stringMap[sorted_word].append(word)
        # print(stringMap)
        return stringMap.values()