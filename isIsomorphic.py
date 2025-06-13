# // Time Complexity :O(N)
# // Space Complexity :O(1) only 26 letters
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :no


# // Your code here along with comments explaining your approach
# use one on one mapping also keep track of letters that had be used or mapped with set
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        #use single hashmap to map ele from s to t also use set to track whihc of ele t are 
        # used in mapping
        if len(s)!=len(t):return False
        d,st=dict(),set()
        for i in range(len(s)):
            if s[i] in d and d[s[i]]==t[i]:
                continue
            elif  s[i] in d and d[s[i]]!=t[i]:
                return False
            elif t[i] not in st:
                d[s[i]]=t[i]
                st.add(t[i]) #t[i] is taken
            else:return False
        return True





###################################################################################################################
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s)!=len(t):return False
        
        def helper(s,t):
            d,d2=dict(),dict()
            for i in range(len(s)):
                if s[i] not in d:
                    d[s[i]]=t[i]
                elif s[i]  in d and d[s[i]]!=t[i]:return False
            return True
        return helper(s,t) and helper(t,s)
