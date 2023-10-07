# Intuition:
# Maintain two maps: one to check if a given element/char in pattern maps to element in s (array) and vice versa. At any point if they dont, return False
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:

        # SC: if pattern has too many letters, each letter could map to a different word so smap can be O(n). however, even in worst case all words in smap should map to all letters in pmap and pmap only could have 26 letters. so SC for pmap & (smap also) should be O(1)
        sMap = {}
        pMap = {}  # SC : O(26) i.e. constant O(1)

        splitArr = s.split()  # SC: Depends on the incoming words thus could be O(n)

        # if length of both strings not equal, return false
        if len(splitArr) != len(pattern):
            return False
        if len(splitArr) == 0 or len(pattern) == 0:
            return False

        for i in range(len(pattern)):  # TC: O(n)
            if pattern[i] not in sMap:
                sMap[pattern[i]] = splitArr[i]  # TC O(1)
            else:
                if sMap[pattern[i]] != splitArr[i]:  # TC O(1)
                    return False
            if splitArr[i] not in pMap:
                pMap[splitArr[i]] = pattern[i]  # TC O(1)
            else:
                if pMap[splitArr[i]] != pattern[i]:  # TC O(1)
                    return False

        return True


obj = Solution()
print(obj.wordPattern("abba", "dog cat cat fish"))
