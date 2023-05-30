#time complexity is O(n)
#space complexity is O(n)
#code ran successfully on leetcode
#Faced no problems while coding 

#Here we are working on word pattern
class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        #Here we are creating a dictionary and a list
        self.dic={}
        self.s=[]
        #Here we are breaking string into list of characters  
        self.pat1=list(pattern)
        #Here we are splitting the s into list of individual strings
        self.pat2=s.split()
        #Checking whether the size of patterns and s are equal or not
        if(len(self.pat1)!=len(self.pat2)):
            return False
        
        for i in range(0,len(self.pat1)):
            #Checking if the pat2 value is in dictionary or not
            if(self.pat2[i] in self.dic):
                #Checking if the same value in pattern 2 is allocated for different values in pattern1 or not
                if(self.dic[self.pat2[i]]!=self.pat1[i]):
                    return False
            else:
                #checking if value in pattern1 has been already assigned to another value in pattern2 
                for j in self.s:
                    if(self.pat1[i]==j):
                        return False
                #creating an entry in dictionary with key as pat2 value and value as pat1 value
                self.dic[self.pat2[i]]=self.pat1[i]
                #We are appending pat1 value in list s
                self.s.append(self.pat1[i])
            
        return True