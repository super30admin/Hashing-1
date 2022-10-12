# // Time Complexity : O(n)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        dictMap = collections.defaultdict(dict)
        lst = s.split(" ")
        if len(pattern) != len(lst):
            return False
        for i in range(len(pattern)):
            #char not present in dictionary
            if pattern[i] not in dictMap:
                #check if value is present with another key
                if lst[i] not in dictMap.values():
                    dictMap[pattern[i]] = lst[i]
                else:
                    return False
            #char present in dictionary
            else:
                val = dictMap[pattern[i]]
                #if the value matches with t[i] then continue
                if val == lst[i]:
                    continue
                else:
                    return False
        return True