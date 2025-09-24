# Time complexity: O(n * klogk)
	#	n = number of strings in the input list.
	#	k = maximum length of a string.
# Space complexity: O(n * k)

# Create a hashmap sort the string 
# Check if sorted string is already there as a key in hashmap. If yes append the str into the array if not create a new key value pair

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        my_dict = {}
        for my_str in strs:
            # converts the list back into a string, which is hashable and can be used as a dictionary key.
            sorted_str = ''.join(sorted(my_str)) 
            if sorted_str not in my_dict:
                my_dict[sorted_str] = []
            my_dict[sorted_str].append(my_str)
        
        return list(my_dict.values())
    


# Prime-Product approach
# Time complexity: O(n * k) as no sorting is required O(k) for prime_product function
# Space complexity: O(n * k) hashmap has all the strings


# Assign every character a prime number and the product of every char in a string is the key in hashmap
# If key is already present then the strings anagram is already there so just append string to the list
# and at the end return all values from hashmap in an array

class Solution:
    def prime_product(self,str):
        prime_numbers = [
    2, 3, 5, 7, 11, 13, 17, 19, 23, 29,
    31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
    73, 79, 83, 89, 97, 101
]
        result = 1
        # loop over the characters in the string
        for char in str.lower():
            # get the index with asci codes
            index = ord(char) - ord('a')
            result *= prime_numbers[index]
        return result


    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        my_dict = {}
        for my_str in strs:
            # converts the list back into a string, which is hashable and can be used as a dictionary key.
            prime = self.prime_product(my_str)
            if prime not in my_dict:
                my_dict[prime] = []
            my_dict[prime].append(my_str)
        
        return list(my_dict.values())
