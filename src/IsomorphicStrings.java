import java.util.HashMap;

/**
 * 
 */

/**
 * @author Aditya sinha
 *
 */
//use 2 Hashmap to store S to T mapping and vice versa
//Time Complexity ; O(n) 
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
public class IsomorphicStrings {
	public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (sMap.containsKey(sChar)) {
                if (sMap.get(sChar) != tChar) return false;
            } else {
                sMap.put(sChar, tChar);
            }

            if (tMap.containsKey(tChar)) {
                if (tMap.get(tChar) != sChar) return false;
            } else {
                tMap.put(tChar, sChar);
            }
        }

        return true;
    }
}

class IsomorphicStringsMain {
	public static void main(String[] args) {
		String s = "egg", t = "add";
		IsomorphicStrings is = new IsomorphicStrings();
		System.out.println("Isomorphic Strings or not - " + is.isIsomorphic(s, t));
	}
}