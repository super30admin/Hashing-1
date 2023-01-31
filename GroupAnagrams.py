#All test cases on leetcode passed for all solutions

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        
        # Here we get primeProduct of each word and store it as key and the actual word as value in dictionary.
        # Finally we return the dictionary values.
        # Time complexity - O(n.k) - where n is number of words and k is average length of each word
        # Space complexity - O(n.k)
        dict = {}
        for s in strs:
            primeProduct = self.getPrimeProduct(s)
            if primeProduct in dict:
                dict[primeProduct].append(s)
            else:
                dict[primeProduct] = [s]
        return dict.values()

    def getPrimeProduct(self, s):
        res = 1
        primeValues = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        for ch in s:
            res = res*primeValues[ord(ch)-ord('a')]
        return res


        #------------OR-------------------------------

        # Here we get 26 letter array-string of each word and store it as string key and the actual word as value in dictionary. 
        # Finally we return the dictionary values.
        # Time complexity - O(n.k) - where n is number of words and k is average length of each word
        # Space complexity - O(n.k)
        dict = {}
        for s in strs:
            smap = [0]*26
            for ch in s:
                smap[ord(ch)-ord('a')]+=1

            if str(smap) in dict:
                dict[str(smap)].append(s)
            else:
                dict[str(smap)] = [s]
        return dict.values()


        #------------OR-------------------------------


        # Here we sort each word and store it as key and the actual word as value in dictionary. 
        # Finally we return the dictionary values.
        # Time complexity - O(n.klogk) - where n is number of words and k is average length of each word
        # Space complexity - O(n.k)
        dict = {}
        for s in strs:
            sortedString = ''.join(sorted(s))
            if sortedString in dict:
                dict[sortedString].append(s)
            else:
                dict[sortedString] = [s]
        return dict.values()
        