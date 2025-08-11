# LeetCode Problem 49: Group Anagrams https://leetcode.com/problems/group-anagrams/
# Result uses defaultdict to group anagrams based on character counts. For each string, we count the occurrences of each character and use that as a key in the dictionary. If t
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res = defaultdict(list)
        for s in strs:
            count = [0]*26
            for c in s:
                # Increment the count for each character in the string. Since the problem has only lowercase letters, we are using a list of size 26
                count[ord(c) - ord('a')] += 1
            # Creating a hashmap key based on character counts
            # This ensures that anagrams will have the same key
            res[tuple(count)].append(s)        
        return list(res.values())