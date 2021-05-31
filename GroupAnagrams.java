// Time Complexity : O(kn) k is no of chars in a string
// Space Complexity : O(kn)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


/**
 * 1. find hash code for each string. Count each character occurrence in the string and form a String as a hash.
 * 2. store strings with the key in the hashmap.
 * 3. return all values grouped by key.
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public String hashCode(String str) {
		int arr[] = new int[26];
		Arrays.fill(arr, 0);
		for (char c : str.toCharArray()) {
			arr[c - 'a']++;
		}

		StringBuilder result = new StringBuilder();
		Arrays.stream(arr).forEach(i -> {
			result.append(i).append("#");
		});
		return result.toString();
	}

	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> result = new ArrayList<>();
		Map<String, List<String>> map= new HashMap<>();
		
		Arrays.stream(strs).forEach(str -> {
			map.computeIfAbsent(hashCode(str), k-> new ArrayList<String>()).add(str);
		});
		
		map.entrySet().stream().forEach(entry-> result.add(entry.getValue()));;
		
		return result;

	}
	
	public static void main(String[] args) {
		String[] strs = new String[] {"eat","tea","tan","ate","nat","bat"};
		System.out.println(new GroupAnagrams().groupAnagrams(strs));
	}
}
