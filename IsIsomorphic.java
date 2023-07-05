// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

import java.util.HashMap;
import java.util.HashSet;

public class IsIsomorphic {
    public static boolean isIsomorphic(String s, String t) {
        if(s == null || t == null) return false;
        if(s.length() != t.length()) return false;
        HashMap<Character,Character> sKeyMap= new HashMap<>();
        HashSet<Character> tValueSet = new HashSet<>();

        for(int i = 0; i < s.length(); i++)
        {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(!sKeyMap.containsKey(sChar))
            {
                if(tValueSet.contains(tChar)) return false;
                sKeyMap.put(sChar,tChar);
                tValueSet.add(tChar);
            }
            else {
                if(sKeyMap.get(sChar) != tChar) return false;
               }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "egg", t = "add";
        System.out.println(isIsomorphic(s,t));
    }
}
