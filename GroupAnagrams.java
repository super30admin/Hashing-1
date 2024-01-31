//Time Complexity - O(n*k log k)
//Space Complexity - O(n)
//Ran in Leetcode - Yes

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
	public static List<List<String>> groupAnagrams(String[] strs) {
		HashMap<String, ArrayList<String>> map = new HashMap<>();
		for (String s : strs) {
			char[] ch = s.toCharArray();
			Arrays.sort(ch);
			String key = new String(ch);
			
			if(!map.containsKey(key)) 
				map.put(key, new ArrayList<String>());
			map.get(key).add(s);
			
		}
		return new ArrayList<>(map.values());

	}

}
