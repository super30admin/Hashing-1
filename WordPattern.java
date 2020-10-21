// Time Complexity : O(n)
// Space Complexity : O(26) + O(nl) here n is number of strings and l is the length //of each string
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
	public boolean wordPattern(String pattern, String s) {

		if (null == pattern || null == s) {
			return false;
		}

		String[] split = s.split(" ");
		if (split.length != pattern.length()) {
			return false;
		}

		Map<Character, String> patternToStringMap = new HashMap<Character, String>();
		Map<String, Character> stringToPatternMap = new HashMap<String, Character>();

		for (int i = 0; i < pattern.length(); i++) {
			char ch = pattern.charAt(i);

			if (patternToStringMap.containsKey(ch)) {
				String mappedValue = patternToStringMap.get(ch);
				if (!mappedValue.equals(split[i])) {
					return false;
				}
			} else {
				patternToStringMap.put(ch, split[i]);
			}

			if (stringToPatternMap.containsKey(split[i])) {
				char mappedChar = stringToPatternMap.get(split[i]);
				if (mappedChar != ch) {
					return false;
				}
			} else {
				stringToPatternMap.put(split[i], ch);
			}
		}

		return true;

	}
}

