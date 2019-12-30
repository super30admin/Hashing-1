class Solution:
    def groupAnagrams(self, strs: [str]) -> [[str]]:
        """
            // Time Complexity: O(nlogn)
            // Space Complexity: O(n)
                We need to store all the keys and values.
            // Did this code successfully run on Leetcode :
                Yes
            // Any problem you faced while coding this :
                I forget how to use the join function.
                Had to look at the documentation
            // Your code here along with comments explaining your approach:
                I am sorting each word. If the sorted word already exists in the
                dict then we know the original word should be part of that group.
                I am storing the sorted word corresponding to the original words in
                the dictionary.
        """
        str_dict = {}
        # traversing whole list O(n)
        for words in strs:
            # join takes O(n)
            # sorted takes O(nlogn)
            cur = ''.join(sorted(words))
            # check if cur exists O(1)
            if cur in str_dict:
                # to append to the list O(1)
                str_dict[cur].append(words)
            else:
                # to create a new list O(1)
                str_dict[cur] = [words]
        # traversing whole dict to get all values O(n)
        return str_dict.values()


if __name__ == '__main__':
    h = Solution()
    print(h.groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"]))
