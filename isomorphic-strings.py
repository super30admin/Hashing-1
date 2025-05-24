# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode :yes
# Any problem you faced while coding this :no


# Your code here along with comments explaining your approach


   def isIsomorphic(self, s, t):

       """

       :type s: str

       :type t: str

       :rtype: bool

       """


       if len(s) != len(t):

           return False

       mapS = {}

       mapT = {}

       for i in range(len(s)):

           if s[i] not in mapS:

               mapS[s[i]] = t[i] #insert s[i]:t[i]

           else:

               if mapS[s[i]] != t[i]:

                   return False

           if t[i] not in mapT: #mapT used to check if same character mapped to different variable

               mapT[t[i]] = s[i]

           else:

               if mapT[t[i]] != s[i]:

                   return False

       return True