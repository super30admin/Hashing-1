// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

package problem2;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
	/*
	 * Loop through the strings, and assign them to a hashmap with key as the
	 * current character and value as its index(if not already present). If the
	 * values of indices of the corresponding characters of two strings do not
	 * match, they are not isomorphic.
	 */
	public boolean isIsomorphic(String s, String t) {
		if (s.equals(t)) {
			return true;
		}

		Map<Character, Integer> map1 = new HashMap<Character, Integer>();
		Map<Character, Integer> map2 = new HashMap<Character, Integer>();
		int n = s.length();

		for (int i = 0; i < n; i++) {
			if (!map1.containsKey(s.charAt(i))) {
				map1.put(s.charAt(i), i);
			}
			if (!map2.containsKey(t.charAt(i))) {
				map2.put(t.charAt(i), i);
			}

			if (map1.get(s.charAt(i)) != map2.get(t.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		IsomorphicStrings obj = new IsomorphicStrings();
		System.out.println("Are strings \"mother\" and \"father\" isomorphic? " + obj.isIsomorphic("mother", "father"));
		System.out.println("Are strings \"binary\" and \"linear\" isomorphic? " + obj.isIsomorphic("binary", "linear"));
		System.out.println("Are strings \"badc\" and \"baba\" isomorphic? " + obj.isIsomorphic("badc", "baba"));
	}

}
