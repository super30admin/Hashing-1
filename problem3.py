# 290. Word Pattern

# // Time Complexity : O(n)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


# // code here along with comments explaining approach

def wordPattern(self, pattern: str, s: str) -> bool:
    listS = s.split()
    if len(pattern) != len(listS): return False
    hmap1 = dict() # hashmap for pattern to s
    hmap2 = dict() # hashmap for s to pattern
    for i in range(len(pattern)): # O(n)
        if pattern[i] in hmap1:
            if hmap1[pattern[i]] != listS[i]:
                return False
        if listS[i] in hmap2:
            if hmap2[listS[i]] != pattern[i]:
                return False
        else:
            hmap1[pattern[i]] = listS[i]
            hmap2[listS[i]] = pattern[i]
    return True
        