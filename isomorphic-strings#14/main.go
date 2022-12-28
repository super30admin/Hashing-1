package main

import "fmt"

func isIsomorphic(s string, t string) bool {

	// edge case
	if len(s) != len(t) {
		return false
	}

	// need map for both strings
	sMap := make(map[string]string)
	tMap := make(map[string]string)

	// iterate over strings
	for i := 0; i < len(s); i++ {
		// if key is already present, continue if value is same
		// i.e. we do not want to exit early as the mapping is still valid
		val, present := sMap[string(s[i])]
		if present {
			// get value and check if its equal to new value
			if val == string(t[i]) {
				continue
			}
			// if the new value for a given character from s string is different then we exit early as strings cannot be isomorphic
			return false
		}
		// key for sMap is char of s string and value is t char
		sMap[string(s[i])] = string(t[i])

		// do same for tMap
		val, present = tMap[string(t[i])]
		if present {
			if val == string(s[i]) {
				continue
			}
			return false
		}
		// key for sMap is char of s string and value is t char
		tMap[string(t[i])] = string(s[i])

	}
	return true

}

func main() {
	fmt.Println("isIsomorphic : ", isIsomorphic("egg", "add"))
}
