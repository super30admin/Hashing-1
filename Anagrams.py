class Solution:
    """
    Time complexity : O(n * m) n -> no.of words, m->length of longest word in given list.
    Space complexity : O(n) n -> no.of words.
    """
    
    def prime_product(self, str):
        prime_list = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53,                   59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        product = 1
        for s in str:
            product *= prime_list[ord(s) - 97]
        return product

    
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagrams_dic = dict()
        result = []
        for s in strs:
            # key will same for anagrams
            key = self.prime_product(s)
            anagrams = []
            if key in anagrams_dic:
                anagrams =  anagrams_dic[key]
            anagrams.append(s)
            anagrams_dic[key] = anagrams
        for key in anagrams_dic:
            result.append(list(anagrams_dic[key]))
        return result
    
   
        