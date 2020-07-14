// Time Complexity : O(n klog k), n is length of words/ strings, K is length of strings of string 
// Space Complexity : O(n k)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : none


// Your code here along with comments explaining your approach
/* Having hashmap to store sorted word as key and value as respective words in list*/

import java.util.*;

public class GroupAnagrams {
	public static List<List<String>> groupAnagrams(String[] strs) {
		HashMap<String, List<String>> map = new HashMap<>();   // hashmap to store sorted word as key, value as list of words matching with key
		for(int i=0; i<strs.length; i++) {
			char[] c = strs[i].toCharArray();
			
			Arrays.sort(c);
			
			String sortedWords = String.valueOf(c);
			
			if(!map.containsKey(sortedWords)) {				// if map does not contain key as sorted words, then initialize with sorted words and value as list
				map.put(sortedWords, new ArrayList<String>());
			}
			map.get(sortedWords).add(strs[i]);				// if map contains key, then add the original string as list of values
		}
		return new ArrayList<List<String>>(map.values());
		
	}
	public static void main(String[] args) {
		String s[] = {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println("Output:" +groupAnagrams(s));
	}
}
