# Time complexity: O(n) where n is the number of chars in the string
# Space Complexity: O(1), since we have 26 alphabets, if we can create an dictionary for 26 letters as key.
# But I created as a dynamic dictionary. is there any other that I can do?
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : No



class Solution:


    def isIsomorphic(self, s: str, t: str) -> bool:

        HashMap = {}

        #we iterate throug each word and if it is in the key of dictionary,
            #if not we create a new key with the word and store the correspinding t value
            #if it is present in the key, we will check, if the value of the key is same as the value of corresponding t position
            #if it is we will continue, other wise we will return false.
        # we will iterate through each word separately with the same conditions.

        for i in range(len(s)):

            if s[i] in HashMap.keys():
                if HashMap[s[i]] != t[i]:
                    return False

            else:

                HashMap[s[i]] = t[i]

        for i in range(len(t)):

            if t[i] in HashMap.keys():
                if HashMap[t[i]] != s[i]:
                    return False

            else:

                HashMap[t[i]] = s[i]

        return True
