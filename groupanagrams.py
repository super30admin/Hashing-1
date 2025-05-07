"""
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
We wll take the string sort it and check if it is already ut in a hashmap, if not
we will put it in a hasmap and check if the other string encountered aligns with the string, if yes, we will put it as a value
of the sorted string in a hashmap. Finally we will print all the values
Time Complexity: O(nklogk)- where k is the length of the string and n is the input string size
space:O(n)

"""


class Solution:
    def groupAnagrams(self, strs):
        if strs==None or len(strs)==0:
            return []
        hashmap=dict()
        for string in strs:
            # print(string)
            # string.split()
            sortedString="".join(sorted(string))
            print("the sorted string is", sortedString)
            # ' '.join(sortedString)
            # print(sortedString)
            if not sortedString in hashmap.keys():
                hashmap[sortedString]=[string]
            # else:
            #     hashmap[sortedString] = [string]
            else:
                hashmap[sortedString].append(string)
            # ### for the key there's an array list
            # hashmap[sortedString]=string
            # hashmap.get(sortedString)=string
            # hashmap.get(sortedString)=string
        return [hashmap.values()]



strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
print(strs)
solve=Solution()
print(solve.groupAnagrams(strs))