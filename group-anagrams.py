#time complexity : nk #k is the characters in the strings and n is the number of words
#space complexity : n i.e. number of words
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        #defining hash for adding primeproduct as a key and the word 
        groupword=dict()
        for words in strs:
            #getting primeproduct of each word
            primePvalue = primeproduct(words)
            
            #if prime product doesnot exists in the hash then it will add 
            if(primePvalue not in groupword):
                groupword[primePvalue]=[words]
            #if the prime product already exist then the word will be appended
            else:
                groupword[primePvalue].append(words)
        print(groupword)
        #returning all the values               
        return groupword.values()
    
    #calculating prime product of the string
def primeproduct(strings : str):
    #List of first prime numbers for all the alphabets
    prime_numbers=[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101]

    result=1
    for char in strings:
        #Calculating the index of the prime number do which the character will be mapped
        location= ord(char)-ord('a')
        result *= prime_numbers[location]
            
    return result
