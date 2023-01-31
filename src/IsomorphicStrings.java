// Time Complexity : O(N) where N is the length of string
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

/**
 * Since two strings are of same size, take two arrays of size 256.
 * Then iterate over the length of string s and put t's ith char in
 * s1 array at s's ith char and vice versa only when both indices are
 * empty. Then iterate over the string again and verify if all chars 
 * are put in correct indices in the opposite array respectively. If so,
 * return true, else false.
 *
 */
public class IsomorphicStrings {
	public boolean isIsomorphic(String s, String t) {
		if (s == null || t == null)
			return false;
		char[] s1 = new char[256];
		char[] s2 = new char[256];
		for (int i = 0; i < s.length(); i++) {
			if ((s1[s.charAt(i)] == (char) 0) && (s2[t.charAt(i)] == (char) 0)) {
				s1[s.charAt(i)] = t.charAt(i);
				s2[t.charAt(i)] = s.charAt(i);
			}
		}

		for (int i = 0; i < s.length(); i++) {
			if (s1[s.charAt(i)] != t.charAt(i) || s2[t.charAt(i)] != s.charAt(i))
				return false;
		}
		return true;
	}
}
