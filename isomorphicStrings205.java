package nov22OOPs;

import java.util.HashMap;

// Problem 12
// LeetCode 205
// https://leetcode.com/problems/isomorphic-strings/
// https://github.com/super30admin/Hashing-1/
public class isomorphicStrings205 {
	public boolean isIsomorphic(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		HashMap<Character, Character> sMap = new HashMap<>();
		HashMap<Character, Character> tMap = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char sChar = s.charAt(i);
			char tChar = t.charAt(i);
			if (sMap.containsKey(sChar)) {
				if (sMap.get(sChar) != tChar) {
					return false;
				}
			} else {
				sMap.put(sChar, tChar);
			}
			if (tMap.containsKey(tChar)) {
				if (tMap.get(tChar) != sChar) {
					return false;
				} else {
					tMap.put(tChar, sChar);
				}
			}

		}

		return true;
	}

	// Time complexity o(n)
	// Space complexity o(1)

}
