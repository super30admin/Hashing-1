// Time complexity - O(n*klog(k)) - n -> length of input array,k -> max length of string in input array
// Space complexity - O(n*k)
function groupAnagrams(strs: string[]): string[][] {
	const map = new Map<string, string[]>();

	for (let str of strs) {
		const sorted = str.split("").sort().join("");

		if (map.get(sorted)) {
			map.get(sorted).push(str);
		} else {
			map.set(sorted, [str]);
		}
	}

	return Array.from(map.values());
}
