"""
Approach:
You use a hash-mapping strategy based on character frequency counts.
For each word in the input list, you build a 26-length frequency vector.
You convert that vector into a tuple (making it hashable) and use it as a key in a dictionary (defaultdict(list)), grouping all words with identical frequency signatures under the same key.
Finally, you return all the grouped anagram lists.

Time Complexity:
	•	Building the count for each word: O(L) where L is the word length.
	•	Doing this for all words: O(N * L), where N = number of strings.
	•	Overall complexity: O(N * L)

Space Complexity:
	•	Dictionary stores frequency tuples and grouped words.
	•	Each count tuple is size 26, and storing all words costs O(N * L) in total.
	•	Overall space: O(N * L)
"""

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagrams = defaultdict(list)

        for word in strs:
            # Create a count of each letter (26 English lowercase letters)
            count = [0] * 26
            for char in word:
                count[ord(char) - ord('a')] += 1
            # Use the tuple of counts as a hashable key
            anagrams[tuple(count)].append(word)

        return list(anagrams.values())
