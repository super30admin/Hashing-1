
"""
Time Complexity : O(n)
Space Complexity : O(k)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No


I iterated through the string array once, at every word, i calculated the prime factor of it,
checked if it is present in a dictionary or not. If not, I add it and append the value to a list. If
prsent, I go to the key and append the value. At the end, I return all the dictionary values
"""


class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        if not strs:
            return []
        d = {}
        for i in strs:
            val = self.calcultePrime(i)
            if val not in d:
                d[val] = [i]
            else:
                d[val].append(i)
        return d.values()

    def calcultePrime(self, string):
        arr = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41,
               43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        result = 1
        for i in string:
            val = ord(i)-ord('a')
            result *= arr[val]
        return result
