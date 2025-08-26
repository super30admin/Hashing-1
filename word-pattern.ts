// Time complexity - O(n+k) , n-> length of pattern string, k -> length of s
// Space complexity - O(n+k)
function wordPattern(pattern: string, s: string): boolean {
	const sArr = s.split(" ");
	if (pattern.length !== sArr.length) return false;

	const patterntMap = new Map<string, string>();
	const sMap = new Map<string, string>();

	for (let i = 0; i < pattern.length; i++) {
		const pChar = pattern[i];
		const sWord = sArr[i];

		if (patterntMap.get(pChar)) {
			if (patterntMap.get(pChar) !== sWord) return false;
		} else {
			patterntMap.set(pChar, sWord);
		}

		if (sMap.get(sWord)) {
			if (sMap.get(sWord) !== pChar) return false;
		} else {
			sMap.set(sWord, pChar);
		}
	}
	return true;
}
