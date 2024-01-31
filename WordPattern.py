# Time complexity - o(n) n is the length of pattern
# Space complexity - o(1) constant space in set and dictionary

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        sList = s.split(" ")
        if len(pattern) != len(sList):
            return False
        hashMap = dict()
        hashSet = set()

        for i in range(len(pattern)):
            key = pattern[i]
            value = sList[i]
            if key in hashMap:
                if hashMap[key] != value:
                    return False
            else:
                if value in hashSet:
                    return False
                else:
                    hashMap[key] = value
                    hashSet.add(value)
        return True
