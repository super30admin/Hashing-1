package main

import (
	"fmt"
	"strings"
)

// Time : 0(N) - where N is the length of the pattern
// Space : O(1) - will tend towrads constant after we have 26 chacters in patternMap, as each char will be mapped to a unique string?
func wordPattern(pattern string, s string) bool {

	charMap := make(map[string]string)
	sMap := make(map[string]string)
	// convert to []string
	sArray := strings.Split(s, " ")

	// edge cases
	if len(pattern) != len(sArray) {
		return false
	}

	// loop over pattern and create a map
	// basically a will be dog and b will be cat

	for i := 0; i < len(pattern); i++ {

		//check if key is already present
		val, present := charMap[string(pattern[i])]
		if present {
			//check if value is same and if not same then exit
			if val != sArray[i] {
				return false
			}
		}
		// else set the key and its desired value
		charMap[string(pattern[i])] = sArray[i]

		// do for sMap as well
		//check if key is already present
		val, present = sMap[sArray[i]]
		if present {
			//check if value is same and if not same then exit
			if val != string(pattern[i]) {
				return false
			}
		}
		// else set the key and its desired value
		sMap[sArray[i]] = string(pattern[i])

	}
	return true
}

func main() {
	fmt.Println("matches pattern : ", wordPattern("abba", "dog cat cat dog"))
}
