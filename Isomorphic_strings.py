// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
#I have used 2 HashMaps for s and t strings or we can use one HashMap and HashSet and we can store t characters in set and check if the key is mapped to same value
#So set contains value if the value is repeated then return False because 2 keys can't have same value

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if not s or not t:
            return False
        sdict = {}
        tdict = {}
        for i in range(len(s)):
            if s[i] not in sdict:
                sdict[s[i]] = t[i]
            else:
                if sdict[s[i]] != t[i]:
                    return False

        for i in range(len(t)):
            if t[i] not in tdict:
                tdict[t[i]] = s[i]
            else:
                if tdict[t[i]] != s[i]:
                    return False

        return True

#Time - O(N)
#Space - O(1)

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if not s or not t:
            return False
        sdict = {}
        tSet = set()
        for i in range(len(s)):
            if s[i] in sdict:
                if sdict[s[i]] != t[i]:
                    return False
            else:
                if t[i] in tSet:
                    return False
                sdict[s[i]] = t[i]
                tSet.add(t[i])   
        return True




