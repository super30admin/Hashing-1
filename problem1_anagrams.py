#time complexity : O(n * klogk) when n is the number of words and k is the length of the longest word    
#space complexity: O(n*k), 
#Submit on leetcode : yes


class Solution:
    def groupAnagrams(self, strs: list[str]) -> list[list[str]]:
        anagr_words = {}

        for word in strs:
            sortedword = ''.join(sorted(word)) 

            if sortedword in anagr_words:
                anagr_words[sortedword].append(word)
            else:
                anagr_words[sortedword] = [word]
            
        return list(anagr_words.values())



solution = Solution()


strs1 = ["eat", "tea", "tan", "ate", "nat", "bat"]
result1 = solution.groupAnagrams(strs1)
print("Grouped Anagrams:", result1)