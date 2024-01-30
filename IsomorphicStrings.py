'''
TC: O(n) where n is the length of s
SC: O(1) since we can only store 26 characters maximum
'''
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(set(s))!=len(set(t)):
            return False
        map_ = {}
        tset = set()
        for i,letter in enumerate(s):
            if letter not in map_:
                map_[letter] = t[i]
                if t[i] not in tset:
                    tset.add(t[i])
                else:
                    return False
            else:
                if map_[letter] != t[i]:
                    return False
        return True

s = Solution()
print(s.isIsomorphic("egg", "add"))
print(s.isIsomorphic("foo", "bar"))
print(s.isIsomorphic("ab", "bc"))
print(s.isIsomorphic("ab", "ba"))
print(s.isIsomorphic("paper", "title"))