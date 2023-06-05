# Submitted by : Aryan Singh_RN12MAY2023
# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    '''
    Map each character to a prime number. 
    Product of letter of a word will be unique and anagrams will have same products.
    Group each anagrams as value to key of products in a hashtable.
    '''
    def groupAnagrams(self, strs):
        prime_val = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        # hashmap to store prime product and  corresponding strings
        hm = {}
        for word in strs:
            product = 1
            for char in word:
                product *= prime_val[ord(char) - ord('a')]
            if product not in hm:
                hm[product] = [word]
            else:
                hm[product].append(word)
        
        return list(hm.values())


# test method:
def test_groupAnagrams():
    s = Solution()
    input_list = ["eat", "tea", "tan", "ate", "nat", "bat"]
    expected_output = [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]
    assert s.groupAnagrams(input_list) == expected_output

test_groupAnagrams()