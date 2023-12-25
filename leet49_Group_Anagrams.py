# Solution

# // Time Complexity : O(nlogn)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : None


# // Your code here along with comments explaining your approach
# Approach is to sort each string and save original string in dictionary with sorted value as key. This helps us keep all the
# strings which are anagrams under same key in dictionary

from collections import defaultdict
def groupAnagrams(strs):
    # Solution suggested by Sudharshan and Suhas
    sortedDict = defaultdict(list)

    for str in strs:
        sortedStr = ''.join(sorted(str))
        sortedDict[sortedStr].append(str)
    
    return sortedDict.values()

if __name__ == "__main__":
    strs = ["eat","tea","tan","ate","nat","bat"]
    print(groupAnagrams(strs))