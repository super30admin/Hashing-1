/* time complexity : O(n)
space complexity : O(n) */

func isIsomorphic(s string, t string) bool {
	if len(s) != len(t) {
		return false
	}
	sMap := make(map[byte]byte)
	tMap := make(map[byte]byte)
	for i := 0; i < len(s); i++ {
		sVal := s[i]
		tVal := t[i]
		if val, ok := sMap[sVal]; ok {
			if val != tVal {
				return false
			}
		} else if _, ok := tMap[tVal]; ok {
			return false
		}
		sMap[sVal] = tVal
		tMap[tVal] = sVal
	}
	return true
}