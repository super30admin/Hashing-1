#Time complexity: O(n)
#Space complexity: O(1)

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:

        d = dict()
        hashSet = set()

        for i in range(len(s)):

            if s[i] in d:
                if d[s[i]] != t[i]:
                    return False

            else:
                if t[i] in hashSet:
                    return False
                
                hashSet.add(t[i])
                d[s[i]] = t[i]

        return True


s = "egg"
t = "add"
res = Solution()
output = res.isIsomorphic(s, t)
print(output)