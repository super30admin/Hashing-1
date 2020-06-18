#Isomorphic strings

class Solution:
	def isIsomorphic(self, s: str, t: str) -> bool:
		if len(set(s)) == len(set(t)):
			m = {}
			for i in range(len(s)):
				if s[i] not in m:
					m[s[i]] = t[i]
				elif t[i] != m[s[i]]:
					return False
			return True
		return False


#Time complexity - O(1) as it is targetted search
#Space complexity - O(n) where n is the length of hashmap(max 26)

#all test cases passed 