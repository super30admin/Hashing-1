"""
https://leetcode.com/problems/group-anagrams/

Time Complexity: O(nclogc)
Space Complexity: O(nc)

This worked on Leetcode.
I did not get any errors.

**Prime product method is giving errors in Leetcode.**

Method 1: Iterate through all the words and compare each word to check if they contain same characters.
Traversal: O(n^2)
Method 2: Sort each word and store in hash map with key if it is not present as the sorted word and value as all the
words that can be sorted to give same key or sorted value. Anagram will have the same sorted values.
Example:
aet : [eat, tea, ate]
ant : [tan, nat]
abt : [bat]

Time Complexity:
n = number of strings

Iterate through the strings: O(n)

Sorting each string: O(clogc), c = number of characters in a word; if average length of words is large, clogc plays a
large factor.
Sorting all strings: O(nclogc)

Store sorted value as key and its corresponding anagram in a hash map. Only create a new key if it does not already
exists.

Hash map lookup for a each string: O(1)
Hash map lookup for all strings: O(n)

Space Complexity (ignore input and output):
Hashmap creation: O(nc)
If we are supposed to output hashmap, then O(1)
"""


class Solution:
    def groupAnagrams(self, strs):
        # hashing using custom hash map dictionary and sorting

        hashMap = {}
        for word in strs:  # O(nklogk)
            sortedWord = "".join(sorted(word))  # sorted gives list
            if sortedWord not in hashMap:
                hashMap[sortedWord] = list()

        for word in strs:  # O(nklogk)
            sortedWord = "".join(sorted(word))
            # print(hashMap[sortedWord])
            hashMap[sortedWord].append(word)

        ans = []  # O(n)
        for key in hashMap:
            ans.append(hashMap[key])

        return ans

# strs = ["eat","tea","tan","ate","nat","bat"]
# groupAnagrams(strs)
# print(groupAnagrams(strs))
