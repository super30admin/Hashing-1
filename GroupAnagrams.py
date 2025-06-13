# // Time Complexity :O(n*klogk)
# // Space Complexity :O(n)
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :


# // Your code here along with comments explaining your approach
# sort the string to find key ,,based on that add to hashmap
class Solution:
    def groupAnagrams(self, s: List[str]) -> List[List[str]]:
        d=defaultdict(list)
        for i in s:
            k="".join(sorted(i))
            
            d[k].append(i)
        return list(d.values())
            
##############################################################################
class Solution:
    def groupAnagrams(self, words: List[str]) -> List[List[str]]:
        anagrams = defaultdict(list)
        for word in words:
            # Create a 26-letter count (assuming lowercase a-z)
            count = [0] * 26
            for ch in word:
                count[ord(ch) - ord('a')] += 1
            key = tuple(count)  # tuples are hashable
            anagrams[key].append(word)
        return list(anagrams.values())
        
