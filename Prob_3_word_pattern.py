class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        """
        Time Complexity: O(n)
        Space Complexity: O(1)

        Did this code successfully run on Leetcode: Yes 

        Any problem you faced while coding this: No

        Your code here along with comments explaining your approach:
        The approach: 
            -> Convert the s string to list
            -> Compare the length of pattern and list -> if different then return false
            -> Traverse the string
            -> Check each char in first string, see if it's there in map
            -> if not then add it to the map and key should be the value at the same index 
            in other string
                -> Add the value from first string to the set.
                -> if you see the set has the value then return false  
            -> if yes then check the value and compare it with the other string's value
                -> if both are not same same return false
                -> if both are same then no need to do anything
            -> in the end of the loop return true
        """

        s_list = s.split(" ")
        if len(pattern) != len(s_list):
            return False
        iso_check = dict()
        iso_set = set()
        for i in range(0, len(pattern)):
            if pattern[i] in iso_check: 
                if s_list[i] != iso_check[pattern[i]]:
                    return False
            else:
                iso_check[pattern[i]] = s_list[i]
                if s_list[i] in iso_set:
                    return False
                else:
                    iso_set.add(s_list[i])
        return True