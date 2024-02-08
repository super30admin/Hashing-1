# If there are n elements in the list of string and k is the average length of each string
# Sorting of one string = O(klog k)
# Time Complexity = O(nklogk)
# Soace Complexity = O(1)

class Solution:
    def groupAnagrams(self, strs: list[str]) -> list[list[str]]:
        
        # Using sorting of each string
        if len(strs) == 0:
            return [[]]
        
        strDict = {}
        
        for i in range(len(strs)):
            string = strs[i]
            # print(string)
            # charList = []
            # charList.append(string)
            # print(charList)
            # sortedL = charList.sort()
            # print(sortedL)
            
            sortedStr = ''.join(sorted(string))
            if sortedStr not in strDict:
                strDict[sortedStr] = []
            
            strDict[sortedStr].append(string)
        
    
        return strDict.values()