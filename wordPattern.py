# // Time Complexity :O(N)
# // Space Complexity :O(N)
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :no


# // Your code here along with comments explaining your approach
#map both pattern to string and viceversa ,,and check if both are equal if they are present in dict

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        d=dict()
        d2=dict() #this for s to pattern
        z=0
        s=s.split(" ")
        if len(s)!=len(pattern):return False
        for i in pattern:
            print(d,d2)
           
            if i not in d and s[z] not in d2:
                d[i]=s[z]
                d2[s[z]]=i
                z+=1
            elif i in d and s[z] in d2 and d[i]==s[z] :
                z+=1
                continue
            else:return False
            
        return True
