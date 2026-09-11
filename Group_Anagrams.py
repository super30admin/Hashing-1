# Time Complexity : O(NK)
# Space Complexity : O(NK)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach in three sentences only
#I have used prime numbers to calculate the product since the prime product will be unique.
#Then map it to same product in hashmap so it will elimiate sorting.

class Solution:
    def groupAnagrams(self, strs:List[str]) -> List[List[str]]:
        if not strs:
            return strs
        dict = {}
        arr = []
        output = []
        for i in strs:
            key = ''.join(sorted(i))
            if i not in dict:
                dict[i] = arr
            else:
                dict[i] = arr.append(i)

        for i in dict:
            output.append(dict[i])

        return output
    
#Time - O(NKlogk) k is each word so sorting k words is klogk and N is the number of words in array.
#Space - O(Nk)

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if not strs:
            return []
        dict = {}
        for str in strs:
            product = 1
            for ch in str:
                product *= self.primes[ch]
            if product not in dict:
                dict[product] = [str]
            else:
                dict[product].append(str)
        return list(dict.values())

    def __init__(self):
        self.primes = {'a': 2, 
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
#Time - O(NK)
#Space - O(NK)
        