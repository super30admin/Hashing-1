"""
The approach here is to iterate through each string in the array, sort the string and 
conisder that the sorted string as the key, then maintain a dict where we store the
sorted string as the key and the index of the key in the array, again while iterating
through the list of string sort each string if we find the key already in the dict
just append the original string in the array by retreving the index of the key from the
dict. continue this and finally return res array of arrays.
"""

class Solution(object):
    def groupAnagrams(self, strs):
        ret = []  # return list[]
        dic = {}
        idx = 0 # index of the list, should be update whenever detects a new key
        for str in strs:
            key = ''.join(sorted(str)) # sort individual element in order
            if key in dic:
                ret[dic[key]].append(str) #ret[idx].append(str)
                print(str, idx, ret[idx - 1])
            else:
                ret.append([str])  
                dic[key] = idx
                idx += 1      
        return ret