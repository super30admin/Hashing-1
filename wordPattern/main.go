package main

import "strings"

/*
290. Word Pattern

Given a pattern and a string s, find if s follows the same pattern.
Here follow means a full match,
such that there is a bijection between a
letter in pattern and a non-empty word in s.



Example 1:
Input: pattern = "abba", s = "dog cat cat dog"
Output: true

Example 2:
Input: pattern = "abba", s = "dog cat cat fish"
Output: false

Example 3:
Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false

*/

// time: o(n) - where n is the len of either slice(s) or len(pattern)
// space: o(s) - where s is the number of words in s string
// 				- we do not compute pattern map in space because there are only handful ascii characters and they are constant
func wordPattern(pattern string, s string) bool {

	sSlice := strings.Split(s, " ")
	if len(sSlice) != len(pattern) {
		return false
	}

	n := len(pattern)

	sMap := map[string]string{}
	pMap := map[string]string{}

	for i := 0; i < n; i++ {

		sWord := sSlice[i]
		pChar := string(pattern[i])
		val, ok := sMap[sWord]
		if ok {
			if val != pChar {
				return false
			}
			continue
		}
		sMap[sWord] = pChar

		val, ok = pMap[pChar]
		if ok {
			if val != sWord {
				return false
			}
			continue
		}
		pMap[pChar] = sWord

	}
	return true
}
