'''
Find the key from the words given based on the ASCII characters.
append the words to that respective key and return the values of the dictionary.

Time Complexity: O(n)
space Complexity: O(n)
'''

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        result = defaultdict(list)

        for s in strs:
            count = [0]*26

            for char in s:
                count[ord(char) - ord('a')] +=1
            
            key = tuple(count)

            result[key].append(s)
        
        return list(result.values())