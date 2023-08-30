'''
1. Maintain a defaultdict for the result as we are returning a list of grouped anagrams
2. We maintain a HashMap for keeping a track of an array count that tells us what letters are in each string and group in the dictionary accordingly 
3. We then return the values of the dictionary as we need only the groups of anagrams
'''

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        res = defaultdict(list)

        for s in strs:
            count = [0]*26

            for c in s:
                count[ord(c) - ord('a')] += 1
                
            res[tuple(count)].append(s)
        
        return res.values()