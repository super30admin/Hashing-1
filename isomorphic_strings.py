# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english: For ismorphic string behavior we need to maintain hash of key pair values of for both the string inputs. This will help us eliminate the words that are not isomorphic and return false immeiately

# Your code here along with comments explaining your approach


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        
        sMap = {};
        tMap = {};
        for i in range(len(s)):
            if s[i] not in sMap:
                sMap[s[i]] = t[i]
            else:
                if sMap[s[i]] != t[i]:
                    return False
                
            if t[i] not in tMap:
                tMap[t[i]] = s[i]
            else:
                if tMap[t[i]] !=s[i]:
                    return False
        return True
                    
        