// Time Complexity : O(nk) where n is the length of the string array,
//    and k is the average length of each string in the array

// Space Complexity : O(n) // since map will contain potentially different
//    hashes for all elements in the string array

// Did this code successfully run on Leetcode : Yes

// Any problem you faced while coding this : Yes
//   My initial implementation used uint64 in Go which didn't consider the
//   max value that it can store, so 1 TC failed. To resolve, I used the
//   big.Int type instead of the uint64 type.

/*
 * Approach:
 * The approach here involves using a hashmap to store the hash of each string.
 * For us, hash of a string is the product of the prime num associated with
 * each character of a string, which is used as the key in the hashmap.
 */

package main

import "math/big"

func groupAnagrams(strs []string) [][]string {
	if len(strs) == 0 {
		return [][]string{}
	}

	m := make(map[string][]string)
	for _, s := range strs {
		hash := getHash(s)
		// if that hash already exists in map, append to array
		if _, ok := m[hash]; ok {
			m[hash] = append(m[hash], s)
		} else { // otherwise, add as a new mapping
			m[hash] = []string{s}
		}
	}

	var vals [][]string
	for _, v := range m {
		vals = append(vals, v)
	}

	return vals
}

// primes is used to compute hash of a string
var primes = []int64{
	2, 3, 5, 7, 11, 13, 17, 19, 23, 29,
	31, 37, 41, 43, 47, 53, 59, 61, 67,
	71, 73, 79, 83, 89, 97, 101,
}

// getHash takes a string and returns a product of the prime numbers
// associated with an alphabet character
func getHash(s string) string {
	p := big.NewInt(1)
	for _, c := range s {
		// product *= primes[c - 'a']
		p.Mul(p, big.NewInt(primes[c-'a']))
	}

	return p.String()
}
