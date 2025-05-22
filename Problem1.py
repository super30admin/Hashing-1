class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        dict_words = {}
        for word in strs:
            sorted_word = ''.join(sorted(word)) 
            if sorted_word not in dict_words:
                dict_words[sorted_word] = [word]
            else:
                dict_words[sorted_word].append(word)
        result = []
        for k,v in dict_words.items():
            result.append(v)
        return result
            
        