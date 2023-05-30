#Time complexity is: O(n) where n is the length of the s
#Space complexity is: O(n) where n is the length os the s
#Code ran successfully on the leetcode
#No issues faced during execution

#Here we are checking for isomorphic strings
class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        #if the length of s and t are not equal, we will be returning false
        if(len(s)!=len(t)):
            return False
        else:
            #creating a dictionary to store value of s[i] as key and index as value
            self.dic={}
            self.variable=list(s)
            for i in range(0,len(self.variable)):
                #If the value is already present, we will be appending them
                if(s[i] in self.dic):
                    self.dic[s[i]].append(i)
                #If the index value is not present, then we will be adding a new entry
                else:
                    self.dic[s[i]]=[i]
            
            #Creating a new dictionary to check if no two characters are mapped to same character
            self.re={}
            for k,v in self.dic.items():    
                for j in v:
                    #checking if same character is mapped to same character, if yes, we will return false
                    if(t[j] in self.re):
                        if(self.re[t[j]]!=k):
                            return False
                    #If no we will be adding an entry to self.re dictionary
                    else:
                        self.re[t[j]]=k
                #If a character is present at morethan one index, we are checking if all the index values in t are have same charaters or not
                if(len(v)>1):
                    temp=t[v[0]]
                    for j in v:
                        #If the characters are different, we will return False
                        if(t[j]!=temp):
                            return False
                            break
            #If it passes all the test cases, it will return true
            return True