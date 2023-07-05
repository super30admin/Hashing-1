# Time Complexity: O(nk)
# Space Complexity : O(n)

# I will find the prime product for each word. I will use prime product as the key and list of words with the same product as values
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagrams={}
        for word in strs:
            key = self.primeProduct(word)
            if anagrams.get(key) is None:
                anagrams[key]= [word]
            else:
                anagrams[key].append(word)
        return anagrams.values()
    
    def primeProduct(self, word):
        product=1
        primeArray=[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101 ]
        for i in word:
            product = product * primeArray[ord(i)-ord('a')]
        return product