/* Time Complexity :  O(nk)) 
 *  n - string to string array
 *  k - Traverse through the pattern one char at a time*/
/* Space Complexity : O(nk)
 *  n - the number of keys in hashmap and 
 *  k - space taken by the values (here the string)*/
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

import java.util.HashMap;
import java.util.HashSet;

class Solution4 {
	public boolean wordPattern(String pattern, String s) {
		if (pattern == null || pattern.length() == 0 || s == null || s.length() == 0)
			return false;

		HashMap<Character, String> map = new HashMap<>();
		HashSet<String> set = new HashSet<>();

		String[] strArr = s.split(" "); // O(n)
		if (pattern.length() != strArr.length)
			return false;
		for (int i = 0; i < pattern.length(); i++) { // O(k)
			char patternChar = pattern.charAt(i);
			String str = strArr[i];

			// If pattern char's mapping already present, check if the existing mapping is
			// same as that of current string
			if (map.containsKey(patternChar)) {
				if (!map.get(patternChar).equalsIgnoreCase(str))
					return false;
			} // mapping not present
			else {// string is already present in the Set ==> return false. Else add values to the map and set
				if (set.contains(str))
					return false;
				else {
					map.put(patternChar, str);
					set.add(str);
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Solution4 obj = new Solution4();
		boolean isMatch = obj.wordPattern("abba", "dog cat cat dog");
		System.out.println(isMatch);
	}
}
