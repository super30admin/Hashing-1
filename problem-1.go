// time complexity : O(n), n = number of letters in the input string array

type Key [26]byte

func groupAnagrams(strs []string) [][]string {
	groups := make(map[Key][]string)

	for _, v := range strs {
		key := getHashValue(v)
		groups[key] = append(groups[key], v)
	}
	result := make([][]string, 0, len(groups))
	for _, v := range groups {
		result = append(result, v)
	}
	return result
}

func getHashValue(str string) (hashValue Key) {
	for i := range str {
		hashValue[str[i]-'a']++
	}
	return hashValue
}

/*func main() {
	strs := []string{"eat", "tea", "tan", "ate", "nat", "bat"}
	result := groupAnagrams(strs)
	fmt.Println(result)
}*/