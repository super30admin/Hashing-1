// Time Complexity : O(n2)
// Space Complexity :O(4n). 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
   public static List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> stringLists = new ArrayList();
		
		String[] alphabetOrderArray = new String[strs.length];
		
		
		for (int i = 0; i < alphabetOrderArray.length; i++) {
			alphabetOrderArray[i] = alphabeticOrder(strs[i]);
		}
		for (int i = 0; i < strs.length; i++) {
			List<String> individualAnagramsList = new ArrayList();
			String anagramString = strs[i];
			if (!anagramString.equalsIgnoreCase("visited")) {
				individualAnagramsList.add(anagramString);
				for (int j = i + 1; j < alphabetOrderArray.length; j++) {
					if (alphabetOrderArray[i].equalsIgnoreCase(alphabetOrderArray[j])) {
						individualAnagramsList.add(strs[j]);
						strs[j] = "visited";
					}
						
				}
				if (individualAnagramsList.size() > 0)
					stringLists.add(individualAnagramsList);
			}
		}

		return stringLists;

	}

	private static String alphabeticOrder(String str) {
		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		return new String(ch);
	}
}
