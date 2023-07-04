# Method 1 - Sort and store in Hashmap 
# Time complexity - O(n*klogk), klogk from the sorting and we iterate over all elements while adding to the hashmap.
# Space Complexity - O(1)
# We sort all the strings in the strs list.
# Then, we iterate over these elements and store them in a hashmap to create a key value pair, by using sorted strings as keys.
# If sorted string (key) already present, then just append to the existing values, else create a new key entry in the hashmap. 
# Here, used a default dict and assigned an empty list at the beginning.

# Method 2 - Prime Product
# Time complexity - O(n*k)
# Space Complexity - O(1)
# Assigned a unique prime to all 26 alphabets (used a hashmap - O(1) search)
# Iterate over all elements and get the prime product and store them in a hashmap to create a key value pair, by using prime product as keys.
# If prime product (key) already present, then just append to the existing values, else create a new key entry in the hashmap. 

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        #Method 1 Sort and Compare using hashmap
        # d=defaultdict(list)
        # for s in strs:
        #     sorted_str="".join(sorted(s))
        #     d[sorted_str].append(s)
        # return d.values()

        #Method 2 Prime Product
        primes = {
                  'a': 2, 
                  'b': 3, 
                  'c': 5, 
                  'd': 7, 
                  'e': 11, 
                  'f': 13,
                  'g': 17,
                  'h': 19,
                  'i': 23,
                  'j': 29,
                  'k': 31,
                  'l': 37,
                  'm': 41,
                  'n': 43,
                  'o': 47,
                  'p': 53,
                  'q': 59,
                  'r': 61,
                  's': 67, 
                  't': 71,
                  'u': 73,
                  'v': 79,
                  'w': 83,
                  'x': 89,
                  'y': 97,
                  'z': 101
                 }
        d=defaultdict(list)
        for s in strs:
            prod=1
            for c in s:
                prod*=primes[c]
            d[prod].append(s)
        return d.values()
