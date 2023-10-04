# class Solution(object):
#     def groupAnagrams(self, strs):
#         """
#         :type strs: List[str]
#         :rtype: List[List[str]]
#         """

#         refMap = {
#             "a": 2,
#             "b": 3,
#             "c": 5,
#             "d": 7,
#             "e": 11,
#             "f": 13,
#             "g": 17,
#             "h": 19,
#             "i": 23,
#             "j": 29,
#             "k": 31,
#             "l": 37,
#             "m": 41,
#             "n": 43,
#             "o": 47,
#             "p": 49,
#             "q": 53,
#             "r": 59,
#             "s": 61,
#             "t": 65,
#             "u": 67,
#             "v": 69,
#             "w": 71,
#             "x": 73,
#             "y": 77,
#             "z": 79
#         }

#         out = {}

#         for i in strs:
#             sum = 0
#             for k in i:
#                 # calculate prime weights
#                 sum = sum + ord(k) * refMap[k]
#                 # print(sum)

#             if sum not in out:
#                 tempArr = []
#                 tempArr.append(i)
#                 out[sum] = tempArr
#             # else:
#             #     out[sum] = out[sum].append(i)

#         return out.values()


# obj = Solution()
# print(obj.groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"]))


class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        out = {}

        for i in strs:  # TC: O(n)
            sortedVal = ''.join(sorted(i))  # TC: O(klog(k))
            if sortedVal not in out:
                out[sortedVal] = []
            out[sortedVal].append(i)  # SC: O(nk)
        return out.values()


obj = Solution()
print(obj.groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"]))
