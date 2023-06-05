# Submitted by : Aryan Singh_RN12MAY2023
# Time Complexity : O(n)
# Space Complexity : Average : O(k), where k is the number of unique characters. Worst : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Using dictionary in python

class Solution:
    '''
    - Mapping each char of string t to string s in a hashtable
    - Reverse mapping s to t in another hashtable
    - If any next occurance of same character, check if mapped value same as it's pair
    '''
    def isIsomorphic(self, s: str, t: str) -> bool:
        # hashtables to store the mapping:
        s_ht = {}
        t_ht = {}
        if len(s) != len(t):
            return False
        for i in range(len(s)):
            if s[i] not in s_ht:
                s_ht[s[i]] = t[i]
            else:
                if s_ht[s[i]] != t[i]:
                    return False 
            # same mapping check for the second hashtable        
            if t[i] not in t_ht:
                t_ht[t[i]] = s[i]
            else:
                if t_ht[t[i]] != s[i]:
                    return False
        return True 


# test method:
def test_isIsomorphic():
    s = Solution()
    assert s.isIsomorphic("egg", "add") == True
    assert s.isIsomorphic("foo", "bar") == False
 
test_isIsomorphic()