# Time Complexity: O(n)
# Space Complexity: O(1) # We need an array of 26 to store the frequency each iteration, but it's constant hence O(1)

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res = {}
        for s in strs:
            freq = self.count(s)
            if freq in res:
                res[freq].append(s)
            else:
                res[freq] = [s]
        return res.values()

    def count(self,s):
        freq = [0] * 26
        for char in s:
            freq[ord(char) - ord('a')] += 1
        return tuple(freq)
