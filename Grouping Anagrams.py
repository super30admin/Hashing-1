# We use a hash map to group words that are anagrams by sorting each word to create a common key.
# Words with the same sorted form are placed in the same group.
# Finally, we return all the grouped anagram lists from the hash map.

class Solution(object):
    def groupAnagrams(self, strs):
        anagram_map = {}

        for word in strs:
            key = ''.join(sorted(word))  # Sort characters to form the key
            if key in anagram_map:
                anagram_map[key].append(word)
            else:
                anagram_map[key] = [word]

        return list(anagram_map.values())

sol = Solution()
print(sol.groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"]))


