# Time complexity: O(n + k ) where n is number of chars in pattern and k is number of words
# Space Complexity: O(n) since the words can be more than 26
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : No


class Solution:

    # we will split the words, based on the spaces and create a list of words. We perform the same isomorphic string
    # method to solve this. where in place of another string we will use another list of words.
    def wordPattern(self, pattern: str, str: str) -> bool:

        words = str.split(" ")

        if len(words) != len(pattern):
            return False
        HashMap = {}

        for i in range(len(pattern)):

            if pattern[i] in HashMap.keys():

                if HashMap[pattern[i]] != words[i]:
                    return False


            else:

                HashMap[pattern[i]] = words[i]

        HashMap2 = {}

        for i in range(len(words)):

            if words[i] in HashMap2.keys():

                if HashMap2[words[i]] != pattern[i]:
                    return False


            else:

                HashMap2[words[i]] = pattern[i]

        return True

