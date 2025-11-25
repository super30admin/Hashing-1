# Fetch 26 prime numbers and assign it to each alphabet. For each of the words in the array, 
# find the products of each of it's letter. Map the product to the list of words with this number.

# Time complexity: O(kn) k= length of each word, n = length of array
# Space complexity: O(1)


class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        d=self.getprime()
        fmap={}
        for i in strs:
            p=1
            for j in i:
                p*=d[j]
            if p not in fmap:
                fmap[p]=[i]
            else:
                fmap[p].append(i)
        l=[]
        for i in fmap:
            l.append(fmap[i])
        return l
    
    def prime(self, n, asci,d):
    
        asc=97+asci
        for i in range(2,n//2+1):
            if n%i==0:
                return False
        d[chr(asc)]=n
        return n

    def getprime(self):
        d={}
        n=0
        start=2
        while n<26:
            num = self.prime(start, n,d)
            if num:
                n+=1
            start+=1
        return d
        
        
        
        