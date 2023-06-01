#Time complexity : O(N)
#Space Complexity: O(N)
#Did the code run in leetcode: Yes
class Solution:
    #This function is used for finding the prime product of the word
    def prime(self, str):
        
        prime = [
            2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61,
            67, 71, 73, 79, 83, 89, 97, 101
        ]
        s = 1
        for i in range(len(str)):
            #finds and return the prime product of a word
            primes = ord(str[i]) - ord('a')
            s = s * prime[primes]
        return s

    def groupAnagrams(self, strs):
        #declaring a dictionary
        words=dict()

        for i in range(len(strs)):
            
            product = self.prime(strs[i])
            print( product)
            #If there are no keys in the dictionary then create and instert the element
            if(words.get(product,0)==0):
                words[product]=[strs[i]]
            else:
                #If there is a element already just append the element to the existing array
                words[product].append(strs[i])

        #returning the values in the declared dictionary
        return words.values()





obj = Solution()
strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
obj.groupAnagrams(strs)