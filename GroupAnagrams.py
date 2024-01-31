# Time complexity - o(nk) n is the length of strs and k is the length of strs[i]
# Space complexity - o(1) constant space dictionary

class Solution:
    def groupAnagrams(self, strs: list[str]) -> list[list[str]]:
        character_mapping = {
            'a': 2,
            'b': 3,
            'c': 5,
            'd': 7,
            'e': 11,
            'f': 13,
            'g': 17,
            'h': 19,
            'i': 23,
            'j': 29,
            'k': 31,
            'l': 37,
            'm': 41,
            'n': 43,
            'o': 47,
            'p': 53,
            'q': 59,
            'r': 61,
            's': 67,
            't': 71,
            'u': 73,
            'v': 79,
            'w': 83,
            'x': 89,
            'y': 97,
            'z': 101
        }

        hashMap = dict()

        for i in strs:
            sum = 1
            for j in i:
                sum *= character_mapping[j]

            if sum not in hashMap:
                hashMap[sum] = [i]
            else:
                hashMap[sum].append(i)

        return hashMap.values()
