#Time Complexity : O(NK*log(K)) - N for going over strs and KlogK for sorting each of them
#Space Complexity : O(NK)


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        groupedWords = defaultdict(list)
        
        for word in strs:
            groupedWords["".join(sorted(word))].append(word)
        
        ans = []
        
        for i in groupedWords.values():
            ans.append(i)
        
        return ans
            
