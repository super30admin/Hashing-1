#Time Complexity : O(n*k) where n is the number of the strings in the input list and k is the maximum length of the string in the list
#Space Complexity : O(n) where n is the number of the strings in the input list (since in worst case all the strings would be stored in the result dictionary)
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this :No

#Approach:In python, we can use defaultdict(list) to create a dictionary with default values as empty list. since we could have multiple
#values for a particular key, we use defaultdict(list) so that we can store these multiple values for a key into the same list.abs
#then we iterate through the string in the input list. We create a count array of length 26 (with each element representing the 
#count of a particular character ('a' to 'z') in the string.) This count is determined by iterating through each character c in the string 
#and incrementing the corresponding index in the count list. Then to add this count into the result, we convert the count list into a tuple 
#which would be used as a key and then append the string s to the list associated with the tuple key (character count pattern) in the result defaultdict.


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        result = defaultdict(list)

        for s in strs:
            count = [0] * 26
            for c in s:
                count[ord(c) - ord("a")] += 1
            
            result[tuple(count)].append(s)
        return result.values()
            
            