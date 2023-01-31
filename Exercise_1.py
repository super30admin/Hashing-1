#Time Complexity : O(N), N being the total number letters in array.
#Space Complexity : O(N), because a dictionary was created with the values. 
#Did this code successfully run on Leetcode : No leetcode link found. 
#Any problem you faced while coding this : I had done a similar one previously
#so did not run into as much problems. I did have to search how to add in a set. 
#And I had to change set to tuples to add to dictionary. 

#Your code here along with comments explaining your approach in three sentences only
'''Created a dictionary with key being a unique number representing all the letters
in the word. Then, for each key, place the word in array of values corresponding to the key. 
'''
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        array = strs
        dictionary = {}
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        for a in array:
            # create a unique key with prime numbers. 
            key = 1
            for i in range(len(a)):
                value = ord(a[i])
                first = ord('a')
                key = key*primes[value-first]
            #create a dictionary where previous key is the key. 
            if key in dictionary.keys():
                dictionary[key].append(a)
            else:
                dictionary[key] = []
                dictionary[key].append(a)
        result = []
        #place dictionary values into an array. 
        for value in dictionary.values():
            result.append(value)
        return result
            