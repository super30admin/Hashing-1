## we store the prime product of a word as the key and the corresponding string is stored as a value in a hashmap
## prime product is basically assigning every character in a string a prime number an dmultiplying them to give a unique key]
## we will iterate through out out hashmap and return a list of list
##Time : O(nk) n--> number of words, k--> letters in a word
## space: O(n)

class Solution:
    def group(self, input):

        output = collections.defaultdict(list)
        res = []
        for i in range(len(input)):

            primeProduct = self.primeProduct(input[i])

            if primeProduct not in output:
                output[primeProduct] = [input[i]]
            
            else:
                output[primeProduct].append(input[i])
        


        for value in output.values():
            res.append(value)
        return res   

    
    def primeProduct(self, str):

        primes = [2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101]

        res = 1

        for i in str:
            res = res * primes[ord(i)-ord("a")]
        
        return res
