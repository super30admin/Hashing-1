#Given an array of strings, group anagrams together.

#Example: Input: ["eat", "tea", "tan", "ate", "nat", "bat"], Output: [ ["ate","eat","tea"], ["nat","tan"], ["bat"] ]

#Note: All inputs will be in lowercase. The order of your output does not matter.

#Approach : Dictionary is created with sorted word as key and the words with same characters as values. Sort each word and check if it's
#already a key in the dictionary and if yes, append the word to the values. If not, create a new key with empty list as value and then 
#append the word. 

input = ["eat", "tea", "tan", "ate", "nat", "bat"]
res = []
dict_words = {}
for word in input:
    sorted_word = ''.join(sorted(word))
    if(sorted_word in list(dict_words.keys())):
        dict_words[sorted_word].append(word)
    else:
        dict_words[sorted_word] = []
        dict_words[sorted_word].append(word)
res = [i for i in dict_words.values()]
print(res)

