// Time Complexity : O(m+ n) m= pattern length, n = number of words in "s" string
// Space Complexity : O(n), n is number of words in "s" string
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
//use hashmap and hashset and start with contains key and check in map and set, 
//if found check the value if not equal return false or else add value

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordPattern {
	public boolean wordPattern(String pattern, String s) {
		if (pattern == null || s == null)
			return false;

		String[] words = s.split(" ");

		if (pattern.length() != words.length)
			return false;

		Map<Character, String> pMap = new HashMap<>();
		Set<String> sSet = new HashSet<>();

		for (int i = 0; i < pattern.length(); ++i) {
			char c = pattern.charAt(i);

			if (pMap.containsKey(c)) {
				if (!(pMap.get(c).equals(words[i])))
					return false;
			} else if (sSet.contains(words[i]))
				return false;
			else {
				pMap.put(c, words[i]);
				sSet.add(words[i]);
			}
		}
		return true;
	}
}
