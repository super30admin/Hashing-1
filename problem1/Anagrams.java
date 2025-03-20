// Time Complexity : O(n.klogk) : n -> size of array, klogk -> for sorting each string in the array
// Space Complexity : O(nk) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

package problem1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagrams {

	// All anagrams, when sorted, will have the same value. Use that as the key, and the string as the value, to group the anagrams together.
	public List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> groupedAnagrams = new HashMap<String, List<String>>();
		
		for(String str: strs) {
			char[] letters = str.toCharArray();
			Arrays.sort(letters);
			String key = String.valueOf(letters);
			if(!groupedAnagrams.containsKey(key)) {
				groupedAnagrams.put(key,  new ArrayList<>());
			} 
			groupedAnagrams.get(key).add(str);
		}
		return new ArrayList<>(groupedAnagrams.values());
	}

	public static void main(String[] args) {
		Anagrams obj = new Anagrams();
		String[] strs = {"are","god","ear","dog","live","evil"};
		List<List<String>> groupedAnagrams = obj.groupAnagrams(strs);
		
		for(List<String> anagrams: groupedAnagrams) {
			for(String word: anagrams) {
				System.out.print(word + ", ");
			}
			System.out.println();
		}
	}

}
