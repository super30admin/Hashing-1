// Time Complexity : O(n^2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach
/*
 * missed the edge case if size of strings is not equal to pattern
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordPattern {
	public boolean wordPattern(String pattern, String s) {
		Map<Character, String> map = new HashMap<>();

		String[] str = s.split(" ");

		ArrayList<String> strList = new ArrayList<>(Arrays.asList(str));
		// edge case
		if (pattern.length() != strList.size())
			return false;

		for (int i = 0; i < pattern.length(); i++) {
			if (!map.containsKey(pattern.charAt(i))) {
				if (!map.containsValue(strList.get(i))) {
					map.put(pattern.charAt(i), strList.get(i));
				} else {
					return false;
				}

			} else {
				if (!map.get(pattern.charAt(i)).equals(strList.get(i))) {
					return false;
				}
			}
		}
		return true;
	}
}
