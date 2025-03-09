// Time Complexity : O(n)
// Space Complexity :O(1). 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
  public boolean wordPattern(String pattern, String str) {

		String splitArray[] = str.split(" ");
		//int splitArrayLength = splitArray.length;
		//int length = pattern.length();
		if (splitArray.length == pattern.length()) {

			HashMap<Character, String> hashMap = new HashMap<Character, String>();
			int count = 0;
			for(int i=0;i<splitArray.length;i++) {
				char patterCharacter = pattern.charAt(i);
				/*
				 * boolean bool=stringTokenizer.nextToken().
				 * toString().equalsIgnoreCase(hashMap.get(patterCharacter));
				 */
         if (hashMap.containsKey(patterCharacter)
						&& !splitArray[i].equalsIgnoreCase(hashMap.get(patterCharacter))) {
					return false;
				} else {
					hashMap.put(patterCharacter, splitArray[i]);
				}
				count++;
			}
			HashSet<String>hashSet = new HashSet<String>(hashMap.values());
			if(hashMap.size()==hashSet.size())
				return true;
			else 
				return false;
		}
		else
			return false;

	}
}
