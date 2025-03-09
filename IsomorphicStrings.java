// Time Complexity : O(n)
// Space Complexity :O(2n). n is length of string
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
  public boolean isIsomorphic(String s, String t) {
		HashMap<Character, Character> mapping = new HashMap<>();

		if (s.length() == t.length()) {
			for (int length = 0; length < s.length(); length++) {
				char sValue = s.charAt(length);
				char tValue =t.charAt(length);
				
				if (mapping.
						containsKey(sValue) && mapping.get(sValue)!=tValue) {
					return false;

				} 
				else {
					mapping.put(sValue, tValue);
				}
				
				HashSet<Character> hashSet = new HashSet<Character>(mapping.values());
				if(hashSet.size()!=mapping.size())
					return false;

			}
			return true;
		}
		return false;
	}


}
