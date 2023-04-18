// Time Complexity : O(n)
// Space Complexity : O(1) // since hashmap will contain at max the number of
//   ASCII characters (pattern elements are keys)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
 * Approach:
 * The approach here involves keeping track of all the mappings pattern element
 * to each string in array of strings using a HashMap, and from each string in
 * array to pattern element using a HashSet. The HashMap tells us if an element
 * is already mapped from pattern, and to which element, and the HashSet tells
 * us if an element of string array is already mapped to ANY element in pattern.
 */

package main

import "strings"

func wordPattern(pattern string, s string) bool {
	if len(pattern) == 0 || len(s) == 0 {
		return false
	}

	sarr := strings.Split(s, " ")
	if len(sarr) == 0 {
		return false
	}

	if len(sarr) != len(pattern) {
		return false
	}

	pMap := make(map[byte]string)     // equivalent to HashMap in Java
	sSet := make(map[string]struct{}) // equivalent to HashSet in Java

	for i := 0; i < len(pattern); i++ {
		if _, ok := pMap[pattern[i]]; ok { // pattern element is mapped
			if sarr[i] != pMap[pattern[i]] { // but mapping is mismatched
				return false
			}
		} else { // pattern element is not mapped
			if _, ok := sSet[sarr[i]]; ok { // but string is already mapped
				return false
			}
			pMap[pattern[i]] = sarr[i]
			sSet[sarr[i]] = struct{}{}
		}
	}

	return true
}
