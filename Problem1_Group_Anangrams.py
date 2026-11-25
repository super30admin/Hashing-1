# Time Complexity : O(nk)
# Space Complexity : O(nk)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
#Approach: 1. We iterate through the given array of words and inititate a count array that stores char frequency in the current word at ord(char) - ord('a') index.
#          2. Since an array is mutable and cannot be hashed, we convert the sig to a tuple and check in the hashmap if that sig already exists.
#          3. If found we append it to the corresponding group array and if not, we inititate a new group array and append the word to that. And, finally we return the hashmap values as a list of lists.

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        groups = {}
        for word in strs:
            count = [0] * 26
            for ch in word:
                count[ord(ch) - ord('a')] += 1
            sig = tuple(count)

            if sig not in groups:
                groups[sig] = []
            groups[sig].append(word)
        return list(groups.values())
