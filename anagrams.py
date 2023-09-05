class Solution:
    def groupAnagrams(self, strs):
        anagrams = {}

        for word in strs:
            # Sort the word to use it as a key for grouping
            sorted_word = ''.join(sorted(word))
            if sorted_word in anagrams:
                anagrams[sorted_word].append(word)
            else:
                anagrams[sorted_word] = [word]

        return list(anagrams.values())
