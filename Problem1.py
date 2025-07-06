# TC :O(N * K log K) where N is the number of strings and K is the maximum length of a string.

# SC :
# O(N * K)

class Solution(object):
    def groupAnagrams(self, strs):
        
        hashmap={}
        for i in strs:
            sortedstr= '',join(sorted(i))
            if sortedstr not in hashmap:
                hashmap[sortedstr]=[]
            hashmap[sortedstr].append(i)
        return list(hashmap.values())
        
