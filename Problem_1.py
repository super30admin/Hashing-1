'''
Time Complexity of Approach 1: O(n klogk). n words and each word of avg length k takes klogk time for sorting.
Time Complexity of Approach 2: O(nk), n words and k for getting the prime product for each char in the word

Space Complexity = O(nk) for storing n words and k characters in each word.

This code works on leetcode.
'''


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        lookup={} #create a hashMap

        # for word in strs: 
        #     new_word= "".join(sorted(word)) #iterating over list of string, sort each string
        #     if new_word in lookup: #check if the sorted string previously exists in the hashMap
        #         words = lookup[new_word] 
        #         words.append(word)#append to list words if the key exits
        #     else: # if the string does not exist in the hashMap
        #         new_list=[word] #create a new list 
        #         lookup[new_word] = new_list #add the sorted word as key to the dictionary with the list as value.
        for string in strs: 
            prod = self.getPrimeProduct(string) #get the prime product of all characters in the string
            if prod in lookup: #if the product exists in the hashMap, append to the list of values
                group = lookup.get(prod)
                group.append(string)
            else:
                newGroup = [string] 
                lookup[prod] = newGroup #else create a new hashMap

        return lookup.values()
    def getPrimeProduct(self, string)->int: #get the prime product for all alphabetical characters in a string
        primeLookup=[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        # 26 prime numbers for 26 alphabets
        prod = 1
        for ch in string:
            prod = prod * primeLookup[(ord(ch)-ord('a'))] 
        return prod