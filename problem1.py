#Time Complexity is O(n*k) where n is the size of the strs and k is the max length of strings in strs
#Space Complexity is O(n*k) where n is the no of string in strs and k is the max length of strings in strs  
#Code ran successfully on leetcode
#Faced no issues while coding

#Implementing Group Anagrams code
class Solution(object):
    def pProduct(self,stringval):
        #we are taking 26 prime numbers such that each alphabet can be assigned with a prime number
        self.prime=[2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103]
        self.result=1
        #For each character in a string we will be calculating the product of prime numbers
        for i in stringval:
            self.result=self.result*self.prime[ord(i)-ord('a')]
        #we will be returning prime product
        return self.result


    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        #creating an output dictionary
        self.output={}
        #if the input strs is empty we will be returning empty list
        if(strs==None or len(strs)==0):
            return [[""]]
        self.HashMap=[]
        #iterating through each string in the input strs
        for i in strs:
            #CAlculating the primeproduct for each of the string in strs
            self.primeProduct=self.pProduct(i)
            #if the product is not present as a key in the output dictionary, we will be creating an entry
            if(self.primeProduct not in self.output):
                self.output[self.primeProduct]=[]
            #We will be appending value to a particular key
            self.output[self.primeProduct].append(i)
        self.finalresult=[]
        #appending all the list values into the finalresult list
        for k,v in self.output.items():
            self.finalresult.append(v)
        #returning the final list which contains group anagrams
        return self.finalresult