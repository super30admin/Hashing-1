// Time complexity - O(n) -> n = length of input string
// Space complexity - O(1)
function isIsomorphic(s: string, t: string): boolean {
	if (s.length !== t.length) return false;

	const sMap = new Map<string, string>();
	const tMap = new Map<string, string>();

	for (let i = 0; i < s.length; i++) {
		const sChar = s[i];
		const tChar = t[i];

		if (sMap.get(sChar)) {
			if (sMap.get(sChar) !== tChar) return false;
		} else {
			sMap.set(sChar, tChar);
		}

		if (tMap.get(tChar)) {
			if (tMap.get(tChar) !== sChar) return false;
		} else {
			tMap.set(tChar, sChar);
		}
	}
	return true;
}
