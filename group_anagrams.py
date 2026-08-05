#Time Complexity : O(n* k)
# Space Complexity : O(n * k)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach in three sentences only

from collections import defaultdict


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        """
        Given the array of strings, group the anagrams together.
        anagram -> An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, using all the original letters exactly once.
        So to group the anagrams, we know that from above definition, we should be able to form a different word using the charcters in a word exactly once. So we can generate the hash using the frequency array and then we use a hashmap to add this key hash and the value of this key would be a list where every time a word comes we hash it and if words are anagrams there hash will be same so we can add them to the list if the hash is mapping and we can return the values in hashmap.

        so basically we need to ahve a dictionary whose default values for keys is a list. we iterate over every word in the input and for each word we geenrate a hash and we add it to the dictionary, so dry run would be we havelets say strs = ["eat","tea","tan","ate","nat","bat"] as input. we iterate over this list, first word is "eat", we iterate over each charcter in this word then get the mapping index in the frequency array by using the ascii value of the char and subrating it by ascii value of 'a' which gives us in range of 0-26. so it maps to one index lets say index 3 and we increement the count from 0 to 1. default frequency array is initialized with 0 and we always increment this so finally for word eat we have as an example 1000100000001000...[26 length] in the freq array we convert that to tuple since dict keys should be immutable and then use it as an hash. so doing this for every word would give repective hashes which we add it to our result dictionary and value would be a list where we append all the words matching that hash.
        """

        result_map = defaultdict(list)
        for word in strs:
            freq_array = [0] * 26
            for c in word:
                freq_array[ord(c) - ord('a')] += 1
            result_map[tuple(freq_array)].append(word)
        return list(result_map.values())
