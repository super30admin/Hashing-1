#Time complexity - O(n log m) --> for traversing through each element and sorting them
#space complexity - O(n) 
#Problem done in Leetcode - Yes
#Any challenges faced - No

#Algorithm :
#we traverse through the list and sort them and check whther they are present in the list or not.If yes we append to the value list of that #particular sorted key else we create a new one.we get all the grouped anagrams in out list.




class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        d=dict()
        out=[]
        for i in strs:
            j=''.join(sorted(i))
            if j not in d.keys():
                d[j]=[i]
            else:
                d[j].append(i)
        for value in d.values():
            out.append(value)
        return out