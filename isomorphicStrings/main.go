package main

/*
Problem 2:
Given two strings s and t, determine if they are isomorphic.
Two strings are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character
while preserving the order of characters.
No two characters may map to the same character
but a character may map to itself.

Example 1: Input: s = "egg", t = "add" Output: true
Example 2: Input: s = "foo", t = "bar" Output: false
Example 3: Input: s = "paper", t = "title" Output: true

Note: You may assume both s and t have the same length.
*/
// time: o(n) - where n is the len of either s or t
// space: o(1) - because there are only handful number of ascii chars and they are constant.
func isIsomorphic(s string, t string) bool {
	if len(s) != len(t) {
		return false
	}

	sMap := map[string]string{}
	tMap := map[string]string{}
	n := len(s)

	for i := 0; i < n; i++ {
		sChar := string(s[i])
		tChar := string(t[i])

		val, ok := sMap[sChar]
		if ok {
			if val != tChar {
				return false
			}
		} else {
			sMap[sChar] = tChar
		}

		val, ok = tMap[tChar]
		if ok {
			if val != sChar {
				return false
			}
		} else {
			tMap[tChar] = sChar
		}
	}
	return true
}
