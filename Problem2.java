package Hashing_Problems;

import java.util.HashMap;
import java.util.HashSet;
/*
 * We check if there is a one to one mapping of elements by storing {s1 : t1} from source to target 
 * in a map and also maintain a hashset to check if the target has been previously mapped to any
 * other element
 * 
 * Time Complexity :
 * O(n) ie no of characters
 * 
 * Space Complexity :
 * Space complexity is O(1) as no of characters are constant and only one to one mapping can exist
 * 
 * Did this code successfully run on Leetcode : yes
 * 
 * Any problem you faced while coding this : No
 * 
 */

public class Problem2 {
	public boolean isIsomorphic(String s, String t) {

		if (s == null || t == null || s.length() != t.length())
			return false;

		HashMap<Character, Character> Smap = new HashMap<Character, Character>();
		HashSet<Character> set = new HashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			Character src = s.charAt(i);
			Character trgt = t.charAt(i);
			if (Smap.containsKey(src) && Smap.get(src) != trgt) {
				return false;
			} else if (!Smap.containsKey(src) && set.contains(trgt))
				return false;
			else {
				Smap.put(src, trgt);
				set.add(trgt);

			}
		}
		return true;
	}
}
