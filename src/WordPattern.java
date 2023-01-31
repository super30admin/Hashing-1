// Time Complexity : O(N) where N is the length of string pattern
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

/**
 * Similar to Isomorphic strings. Split the string into words array.
 * If array length is not equal to pattern length, return false.
 * Then iterate over the pattern. For each char, put the respective indexed
 * word in the answer array taken at the char - 'a' index. If any other string 
 * is already present, return false. Once put, then run a bubble sort kind of 
 * logic iterating over i from 0 to 25 and j from i+1 to 25 and comparing 
 * ans[i] == ans[j]. If equal return false.
 *
 */
public class WordPattern {
	public boolean wordPattern(String pattern, String s) {
		String[] splits = s.split(" ");
		String[] ans = new String[26];
		if (splits.length != pattern.length())
			return false;
		for (int i = 0; i < pattern.length(); i++) {
			char c = pattern.charAt(i);
			if (ans[c - 'a'] == null || ans[c - 'a'].equals(splits[i]))
				ans[c - 'a'] = splits[i];
			else
				return false;
		}
		for (int i = 0; i < 26; i++) {
			for (int j = i + 1; j < 26; j++)
				if (ans[i] != null && ans[j] != null && ans[i].equals(ans[j]))
					return false;
		}
		return true;
	}
}
