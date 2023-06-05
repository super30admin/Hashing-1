# Submitted by : Aryan Singh_RN12MAY2023
# Time Complexity : O(n)
# Space Complexity : Average : O(k), where k is the number of unique characters. Worst : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    '''
    Similar to isomorphic solution. 
    Map char from pattern to words in string two ways in two different hash table.
    Compare them on next occurances.
    '''
    def wordPattern(self, pattern: str, s: str) -> bool:
        p_ht = {}
        words_ht = {}
        words = s.split()
        if len(pattern) != len(words):
            return False
        for i in range(len(pattern)):
            if pattern[i] not in p_ht:
                p_ht[pattern[i]] = words[i]
            else:
                # if the mapping existed previously
                if p_ht[pattern[i]] != words[i]:
                    return False

            if words[i] not in words_ht:
                words_ht[words[i]] = pattern[i]
            else:
                # if the mapping existed previously
                if words_ht[words[i]] != pattern[i]:
                    return False

        return True



# test method:
def test_wordPattern():
    s = Solution()
    assert s.wordPattern("abba", "dog cat cat dog") == True
    assert s.wordPattern("abba", "dog cat cat fish") == False

test_wordPattern()