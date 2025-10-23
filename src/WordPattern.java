import java.util.HashMap;
import java.util.HashSet;

/**
 * 
 */

/**
 * @author Aditya sinha
 *
 */
//use 1 Hashmap to store pattern to string mapping and 1 hashset to see if pattern is mapped earlier or not
//Time Complexity ; O(n) 
//Space Complexity : O(n)
//Did this code successfully run on Leetcode : Yes
public class WordPattern {
	 public boolean wordPattern(String pattern, String str) {

	        String[] arr = str.split(" ");
	        int n = arr.length;
	        int k = pattern.length();

	        if (n != k) return false;

	        HashMap<Character, String> map = new HashMap<>();
	        HashSet<String> set = new HashSet<>();

	        for (int i = 0; i < n; i++) {
	            char ch = pattern.charAt(i);

	            if (map.containsKey(ch)) {
	                if (!map.get(ch).equals(arr[i])) return false;
	            } else {
	                if (set.contains(arr[i])) return false;
	                map.put(ch, arr[i]);
	                set.add(arr[i]);
	            }
	        }

	        return true;
	    }
}
class WordPatternMain {
	public static void main(String[] args) {
		String pattern = "abba", str = "dog cat cat dog";
		WordPattern wp = new WordPattern();
		System.out.println("WordPattern matches or not - " + wp.wordPattern(pattern, str));
	}
}