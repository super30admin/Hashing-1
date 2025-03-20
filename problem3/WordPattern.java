// Time Complexity : O(n)
// Space Complexity : O(m) -> m is the number of unique words and characters present in the respective strings
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

package problem3;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
	/*
	 * Map each character of pattern and each word of string to their indices. If
	 * the corresponding character and words do not have the same index value, the
	 * word does not match the pattern.
	 */
	public boolean wordPattern(String pattern, String s) {
		String[] arr1 = pattern.split("");
		String[] arr2 = s.split(" ");

		if (arr1.length != arr2.length) {
			return false;
		}

		Map<String, Integer> map1 = new HashMap<String, Integer>();
		Map<String, Integer> map2 = new HashMap<String, Integer>();

		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();

		for (int i = 0; i < arr1.length; i++) {
			if (!map1.containsKey(arr1[i])) {
				map1.put(arr1[i], i);
			}
			if (!map2.containsKey(arr2[i])) {
				map2.put(arr2[i], i);
			}

			sb1.append(map1.get(arr1[i]));
			sb2.append(map2.get(arr2[i]));
		}
		return sb1.toString().trim().equals(sb2.toString().trim());
	}

	public static void main(String[] args) {
		WordPattern obj = new WordPattern();
		System.out.println(obj.wordPattern(
				"ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccdd",
				"s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s t t"));
	}
}
