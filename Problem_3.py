#Word Pattern

class Solution:
	def wordPattern(self, pattern: str, str: str) -> bool:
		strs = str.split()
		if len(pattern) == len(strs):
			dict_1 = {}
			dict_2 = {}
			for x in range(len(pattern)):
				if pattern[x] not in dict_1:
					if strs[x] not in dict_2:
						dict_1[pattern[x]] = strs[x]
						dict_2[strs[x]] = pattern[x]
					else:
						return False
				else:
					if dict_1[pattern[x]]!=strs[x]:
						return False
			return True

#Time complexity - O(n) where n = length if pattern or str
#Space complexity - O(n+n) as 2 dictionary are used to check if values in dict_1 are unique

#all test cases passed