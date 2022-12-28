package main

import (
	"fmt"
	"sort"
	"strings"
)

func groupAnagrams(strs []string) [][]string {

	// init an map that keeps
	group := make(map[string][]string)

	fmt.Println(group)
	// loop over given strs
	for i := 0; i < len(strs); i++ {
		// sort each strings
		sortedString := SortString(strs[i])
		// check if key is present in map or not
		//value, present := group["sortedString"]
		group[sortedString] = append(group[sortedString], strs[i])

	}
	// convert map back to list of list of strings
	// this is an extra pass and should be avoided somehow
	anagrams := [][]string{}
	for _, v := range group {
		anagrams = append(anagrams, v)
	}
	return anagrams
}

func SortString(w string) string {
	s := strings.Split(w, "")
	sort.Strings(s)
	return strings.Join(s, "")
}

func main() {
	fmt.Println("groupped anagrams are", groupAnagrams([]string{"eat", "tea", "tan", "ate", "nat", "bat"}))
}
