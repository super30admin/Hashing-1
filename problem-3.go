/*time complexity : O(n)
space complexity : O(3*n)*/
import "strings"

func wordPattern(pattern string, s string) bool {

	split := strings.Split(s, " ")
	if len(split) != len(pattern) {
		return false
	}
	patternM := make(map[byte]string)
	stringM := make(map[string]byte)
	for i := 0; i < len(split); i++ {
		pVal, pOkay := patternM[pattern[i]]
		sVal, sOkay := stringM[split[i]]
		if !pOkay && !sOkay {
			patternM[pattern[i]] = split[i]
			stringM[split[i]] = pattern[i]
			continue
		}
		if (pVal != split[i]) || sVal != pattern[i] {
			return false
		}
	}
	return true
}
