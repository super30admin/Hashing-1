#Time complexity: O(kn) where 'k' is length of strings of s
#Space complexity: O(kn)

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:

        d = dict()
        hashSet = set()
        strArr = s.split(' ')
        if len(pattern) != len(strArr):
            return False

        for i in range(len(pattern)):
            if pattern[i] in d:
                if d[pattern[i]] != strArr[i]:
                    return False

            else:
                if strArr[i] in hashSet:
                    return False
                hashSet.add(strArr[i])
                d[pattern[i]] = strArr[i]


        return True


pattern = "abba"
s = "dog cat cat dog"
res = Solution()
output = res.wordPattern(pattern, s)
print(output)