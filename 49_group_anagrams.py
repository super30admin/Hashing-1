# Use character frequency tuple as the anagram key (avoids sorting).
# Time Complexity: O(n * k), Space Complexity: O(n * k)

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagrams = defaultdict(list)

        for word in strs:
            count = [0] * 26  # lowercase a to z
            for char in word:
                count[ord(char) - ord('a')] += 1
            key = tuple(count)
            anagrams[key].append(word)

        return list(anagrams.values())
