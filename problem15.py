#Time Complexity : O(n)
#Space Complexity : O(n)

#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No

class Solution:
	def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

		res = {}

		for s in strs:
			sString = "".join(sorted(s))

			if sString not in res:
				res[sString] = []

			res[sString].append(s)

		return res.values()