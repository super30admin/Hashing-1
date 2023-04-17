// Time Complexity : O(n)
// Space Complexity : O(1) // since hashmap will contain at max the number of
//   ASCII characters
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
 * Approach:
 * The approach here involves keeping track of all the mappings from s to t
 * using a HashMap, and from t to s using a HashSet. The HashMap tells us if an
 * element is already mapped from s, and to which element, and the HashSet
 * tells us if an element of t is already mapped to ANY element in s.
 */

package main

func isIsomorphic(s string, t string) bool {
	if len(s) == 0 {
		if len(t) == 0 {
			return true
		}
		return false
	}

	sMap := make(map[byte]byte)     // equivalent to HashMap in Java
	tSet := make(map[byte]struct{}) // equivalent to HashSet in Java

	for i := 0; i < len(s); i++ {
		if _, ok := sMap[s[i]]; ok { // if element is already mapped
			if sMap[s[i]] != t[i] { // if mapping is wrong
				return false
			}
		} else { // if element is not mapped
			if _, ok := tSet[t[i]]; ok { // if reverse mapping exists
				return false
			}
			sMap[s[i]] = t[i]       // add mapping to HashMap
			tSet[t[i]] = struct{}{} // add to HashSet
		}
	}

	return true
}
