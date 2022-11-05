#time complexity: O(nk) where n is the number of words i the input and k is the maximum length of word
#space omplexity: O(nk)
#ran on leetcode: Yes
# 2 words are anagrams if they have the same frequncy of letters in them. using this concept, create a dictionary 
# where key is a hash value that is generated from the words. All words that map to the same hash vale will be 
# put in a list(these words are anagrams) abd finally loop throguh all keys and return their values as a list of lists
class Solution:
    def hash_fun(self,string):
        prime_no=[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        prod=1
        for i in string:
            pos=ord(i)-ord('a')
            prod*=prime_no[pos]
        return prod

    def groupAnagrams(self, strs):
        #print(self.hash_fun('s'))
        anagrams={}
        #if()
        for word in strs:
            #word=''
            value=self.hash_fun(word)
            if(value in anagrams):
                anagrams[value].append(word)
            else:
                anagrams[value]=[word]
        L=[]
        for value in anagrams:
            L.append(anagrams[value])
        return L
s=Solution()
strs = ["eat","tea","tan","ate","nat","bat"]
print(s.groupAnagrams(strs))