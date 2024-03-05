// Time Complexity : O(n)
// Space Complexity : O(1) - since we store max of all ascii characters (256)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach in three sentences only
/*
Same approach that we used wordPattern. Maintain a hashmap and hashset. Hashmap is character to list of string mapping and
hashset contains just the t characters.
 */
import java.util.HashMap;
import java.util.HashSet;

public class IsomorphicStrings {

    public static boolean isIsophormic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> sMap = new HashMap<>();
        HashSet<Character> tSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (sMap.containsKey(sChar)) {
                if (tChar != sMap.get(sChar)) return false;
            } else {
                if (tSet.contains(tChar)) {
                    return false;
                } else {
                    sMap.put(sChar, tChar);
                    tSet.add(tChar);
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsophormic("egg", "add"));
        System.out.println(isIsophormic("ggd", "ddg"));
        System.out.println(isIsophormic("egl", "add"));
        System.out.println(isIsophormic("ega", "add"));
    }
}
