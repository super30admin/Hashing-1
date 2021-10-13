# 49. Group Anagrams
# https://leetcode.com/problems/group-anagrams/

# Time Complexity: O(n*mlogm), n is length of input and m in length of each string
# Space Complexity: O(n)

class Solution:
    def sort(self, s):
        s = [a for a in s]
        s.sort()
        return "".join(s)

    def groupAnagrams(self, strs):
        if len(strs) == 1:
            return [strs]

        temp_dict = dict()

        for i in strs:
            sorted_i = self.sort(i)
            if sorted_i in temp_dict:
                temp_dict[sorted_i].append(i)
            else:
                temp_dict[sorted_i] = [i]
        return list(temp_dict.values())

obj = Solution()
print(obj.groupAnagrams(['']))
print(obj.groupAnagrams(['a']))
print(obj.groupAnagrams(["eat","tea","tan","ate","nat","bat"]))