'''
Time Complexity : O(n*k logk) //python sorted method has nlogn complexity
where n is number of elements and k is size of each string

Space Complexity : O(n*k)

Did this code successfully run on Leetcode : Yes

Explanation: Convert each string to tuple and check if tuple exits in hashmap (Used dict in python)
Create list for each tuple and if it exists add the string to the list inside the index of each key.
'''

class Solution:
    def setConvert(self, strs: str) -> int:
        return tuple(sorted(strs))

    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        myDict = {}
        for i in strs:
            l = []
            hashKey = (self.setConvert(i))

            if hashKey in myDict.keys():
                myDict[hashKey].append(i)
            else:
                myDict[hashKey] = [i]

        return (myDict.values())