'''
TC: O(n) where n is the length of pattern
SC: O(1) since we can only store 26 characters maximum
'''
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        mydict = {}
        s = s.split(' ')
        myset = set()
        if len(pattern)!=len(s):
            return False
        for i,letter in enumerate(pattern):
            if letter not in mydict:
                mydict[letter] = s[i]
                if s[i] in myset:
                    return False
                myset.add(s[i])
            else:
                if mydict[letter] != s[i]:
                    return False
        return True
        
s = Solution()
print(s.wordPattern("abba", "dog cat cat dog"))
print(s.wordPattern("abba", "dog cat cat fish"))
print(s.wordPattern("aaaa", "dog cat cat dog"))