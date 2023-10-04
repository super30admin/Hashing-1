// Given an array of strings, group anagrams together.
// Time Complexity : O(n*k)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : -
import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String,List<String>> map = new HashMap<>();
		for(int i=0;i<strs.length;i++) {
			char[] key = strs[i].toCharArray();
			Arrays.sort(key);
			String sortedKey = String.valueOf(key);
			if(!map.containsKey(sortedKey)) {
				map.put(sortedKey,new ArrayList<String>());	
		}
			map.get(sortedKey).add(strs[i]);
		}
		return new ArrayList<List<String>>(map.values());

    }
}

class Problem1
{
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(sol.groupAnagrams(strs));
          
    }
}