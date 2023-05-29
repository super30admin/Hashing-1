# Time Complexity : O(n)
# Space complexity : O(n)
# The code ran on Leetcode
# I am initiating an array of 26, which is the number of alphabets. For each string, I am updating the array such that it shows the frequency of each alphabet in the string. Then I am using this array as key in a dictionary to map it to all anagrams, since all anagrams will have the same key

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # Maintain a dictionary with count of each letter stored in an array as key and the word as the value
        d = {}

        for s in strs:
            # Initiate an array to store count of each letter in an array
            arr = [0]*26

            for i in range(len(s)):
                letter = s[i]
                index = ord(letter) - 97
                arr[index] += 1
            # Convert array to string since array cannot be used as key of a dictionary. All anagrams will have same key
            key = str(arr)
            if key in d.keys():
                d[key].append(s)
            else:
                d[key] = [s]

        out = []
        for k in d.keys():
            out.append(d[k])
    
        return out