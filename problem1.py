#Time Complexity : O(n)
#Space Complexity : O(n)
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No


#Used hashMap to store strings which contain same character sequence. For creating keys, sorting was performed to find the similar character sequence but for storing values, the strings were added as it is.

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        anaList = {}
        result = []

        for str in strs:
            hashValue = "".join(sorted(str))

            if hashValue in anaList.keys():
                anaList[hashValue].append(str)
            else:
                anaList[hashValue] = list()
                anaList[hashValue].append(str)

        for k,v in anaList.items():
            result.append(v)

        return result