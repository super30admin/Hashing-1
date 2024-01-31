//Time Complexity - O(nk) - n - number of elements and k is the number of characters in a String to find a key
//Space Complexity - O(1) - uses primes array, which is a constant array
//Ran in Leetcode - Yes

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class GroupAnagrams_Efficient {
	public static List<List<String>> groupAnagrams(String[] strs) {
		HashMap<Double, ArrayList<String>> map = new HashMap<>();
		int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89,
				97 , 101};
		for (String s : strs) {
			char[] ch = s.toCharArray();
			double key = 1;
			for (char element : ch) {
				key= key * primes[element - 'a'];
			}
			if (!map.containsKey(key))
				map.put(key, new ArrayList<String>());
			map.get(key).add(s);

		}
		return new ArrayList<>(map.values());

	}

}
