#time complexity: O(n) where n is length of s
#space complexity: O(n)
#ran on leetcode: Yes
#this soution is same as problem2 but instead of character to charater mapping we have character to word mapping here.
#We use the same concept of a hashmap and set. We use hashmap to establish a one to one mapping to verify if each character in pattern
# is mapped to only one word in s. We also use set to make sure that a word has not been mapped to another character.
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        pattern_hashmap={}
        word_set=set()
        i=0#pointer to pattern
        j=0 #pointer to words
        word=s.split(' ')
        if(len(pattern)!=len(word)):
            return False
        while(i<len(pattern)):
            if(pattern[i] in pattern_hashmap):
                if(pattern_hashmap[pattern[i]]!=word[j]):
                    return False
            else:
                if(word[j] in word_set):
                    return False
                else:
                    pattern_hashmap[pattern[i]]=word[j]
                    word_set.add(word[j])
            i+=1
            j+=1
        return True

sol=Solution()
pattern = "abba"
s = "dog cat cat dog"
print(sol.wordPattern(pattern,s))
