# LEETCODE PROBLEM 290. WORD PATTERN
# TIME COMPLEXITY: O(N) where N denotes the length of the string s 
# SPACE COMPLEXITY: O (N)
# Any problem you faced while coding this: Was trying approach 2 and had a hiccup when writing the
# code with the set logic 

class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        #Approach 1 : Hashing
        # s=s.split(" ")
        # p_hashmap={}
        # s_hashmap={}
        # if len(s)!=len(pattern):
        #     return False
        # for i in range(len(s)):
        #     alphabet=pattern[i]
        #     word=s[i]
        #     if alphabet not in p_hashmap:
        #         p_hashmap[alphabet]=word
        #     else:
        #         if p_hashmap[alphabet]!=word:
        #             return False
        #     if word not in s_hashmap:
        #         s_hashmap[word]=alphabet
        #     else:
        #         if s_hashmap[word]!=alphabet:
        #             return False
        # return True

        s=s.split(" ")
        w=len(pattern)
        p=len(s)
        pattern_hashmap={}
        s_set=set()

        if w!=p:
            return False
        
        for i in range(w):
            alphabet=pattern[i]
            word=s[i]

            if alphabet in pattern_hashmap:
                if pattern_hashmap[alphabet]!=word:
                    return False
                else:
                    if word in s_set:
                        return False
                    pattern_hashmap[alphabet]=word
                    s_set.add(word)
        return True

