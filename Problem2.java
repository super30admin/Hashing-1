import java.util.HashMap;
// Time Complexity : O(n) where n is the length of the strings
// Space Complexity : O(1) since we are using a fixed size HashMap for 256 characters
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class Problem2 {
    public Problem2() {
    }

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;

        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (!sMap.containsKey(sChar)) {
                sMap.put(sChar, tChar);
            } else {
                if (sMap.get(sChar) != tChar)
                    return false;
            }

            if (!tMap.containsKey(tChar)) {
                tMap.put(tChar, sChar);
            } else {
                if (tMap.get(tChar) != sChar)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Problem2 problem = new Problem2();
        System.out.println(problem.isIsomorphic("egg", "add")); // true
        System.out.println(problem.isIsomorphic("foo", "bar")); // false
        System.out.println(problem.isIsomorphic("paper", "title")); // true
        System.out.println(problem.isIsomorphic("ab", "aa")); // false
    }
}