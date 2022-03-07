/*
Time Complexity : O(n)
Space Complexity : O(1) 2 hashmap of size 26

Did this code successfully run on Leetcode :
Finished in 13 ms
true

Any problem you faced while coding this :
None

Your code here along with comments explaining your approach :
BiMap approach
*/
import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        
        String s = "abcd";
        String t = "efgh";

        System.out.println(isIsomorphic(s, t));
    }

    private static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> mapS2T = new HashMap<>();
        Map<Character, Character> mapT2S = new HashMap<>();
        if(s == null || t == null) return false;
        if(s.length()!= t.length()) return false;
        if(s.equals(t))return true;

        for(int i = 0; i< s.length(); i++){
            if(!(mapS2T.containsKey(s.charAt(i)) || mapT2S.containsKey(t.charAt(i)))){
                mapS2T.put(s.charAt(i), t.charAt(i));
                mapT2S.put(t.charAt(i), s.charAt(i));
            } else if (mapS2T.containsKey(s.charAt(i)) && mapT2S.containsKey(t.charAt(i))){
                if(!mapS2T.get(s.charAt(i)).equals(t.charAt(i)))
                    return false;
            } else {
                return false;
            }
        }
        return true;
    }
}
