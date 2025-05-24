# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode :yes
# Any problem you faced while coding this :no


# Your code here along with comments explaining your approach

#find sum of letters for each string
# put numbers in a  hashmap



        anagram_dict = dict()

        for i in strs:

            sorted_str = "".join(sorted(i))

            if sorted_str not in anagram_dict:


                anagram_dict[sorted_str] = []
            anagram_dict[sorted_str].append(i)


        return list(anagram_dict.values())