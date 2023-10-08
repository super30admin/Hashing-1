class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        """
        Time Complexity: O(nklog(k) + k)
        Space Complexity: O(nk)

        Did this code successfully run on Leetcode: Yes

        Any problem you faced while coding this: No

        Your code here along with comments explaining your approach:
        The approach: 
            first method:
            -> Traverse the list
            -> Sort each element and store the sorted string as key and append original 
            to the value in the list 
            -> After that create an empty list, traverse the dict and store the value in the
            empty list

            second method:
            -> get prime list from 2 to 101
            -> traverse the list
            -> traverse the string
            -> get ascii value of each char and subract it by char(a) to get the prime_list 
            index for that char
            -> get all the prime_list values of each char of string and multiply it 
            -> if the prime product value is not their in the map, create an empty list
            -> add all the strings which in that list which has the same prime product value 
            -> After that create an empty list, traverse the dict and store the values in the
            empty list
        """
        # anagram_dict = dict()
        # for i in strs: # O(n)
        #     sorted_str = ''.join(sorted(i)) # O(klogk)
        #     if sorted_str not in anagram_dict:
        #         anagram_dict[sorted_str] = [i]
        #     else:
        #         anagram_dict[sorted_str].append(i)
        # result = list()
        # for key in anagram_dict:
        #     result.append(anagram_dict[key]) #O (n)
        # return result

        prime_list = [ 2,  3,  5,  7, 11, 13, 17, 19, 23, 29, 
                      31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 
                      73, 79, 83, 89, 97, 101]

        anagram_dict = dict()
        for i in strs: # O(n)
            prime_prod = 1
            for j in i:
                prime_prod *= prime_list[ord(j) - 97]
            
            if prime_prod not in anagram_dict:
                anagram_dict[prime_prod] = []
            anagram_dict[prime_prod].append(i)
        result = list()
        for key in anagram_dict:
            result.append(anagram_dict[key]) 
        return result
