import java.util.Scanner;
import java.util.*;

// Time Complexity : O(n)
// Space Complexity : O(1)
class IsomorphicStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        boolean result = isIsomorphic(str1, str2);
        System.out.println(result);
        sc.close();
    }

    private static boolean isIsomorphic(String s, String t) {
        if (s == null && t == null)
            return true;
        if (s == null || t == null)
            return false;
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
                sMap.put(tChar, sChar);
            } else {
                if (tMap.get(tChar) != sChar)
                    return false;
            }
        }
        return true;
    }
}