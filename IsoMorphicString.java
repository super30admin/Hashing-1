
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on LeetCode : Yes
// Any problem you faced while coding this : No


//Approach - Using 2 hash maps for both Strings s and t.  In a loop by considering one of the string's length
// In each map store the character of that string as key and the value as other strings character at that location.
// check if the value of one map's key is not same as the other string character then return false otherwise
// return true.  Repeat the same step in both maps.
// Edge cases - if the length of both strings  are different, then they are not considered Isomorphic return flase
//



import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsoMorphicString {

    public static boolean isIsomorphicUsingHashMap(String s, String t) {
        //if s  or t is null or s size is not equal to t size then they are not considered Isomorphic
        if( s == null || t == null || s.length() != t.length()) return false;

        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();
        int strSize = s.length();
        for(int i = 0 ; i< strSize; i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(sMap.containsKey(sChar)) {
                if(sMap.get(sChar) != tChar) return false;
            }else{
                sMap.put(sChar, tChar);
            }
            if(tMap.containsKey(tChar)) {
                if(tMap.get(tChar) != sChar) return false;
            }else{
                tMap.put(tChar, sChar);
            }
        }
        return true;
    }
    public static boolean isIsomorphicUsingHashSet(String s, String t) {
        //if s  or t is null or s size is not equal to t size then they are not considered Isomorphic
        if( s == null || t == null || s.length() != t.length()) return false;

        Map<Character, Character> sMap = new HashMap<>();
        Set<Character> tSet = new HashSet<>();
        int strSize = s.length();
        for(int i = 0 ; i< strSize; i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(sMap.containsKey(sChar)) {
                if(sMap.get(sChar) != tChar) return false;
            }else{
                if(tSet.contains(tChar)) return false;
                tSet.add(tChar);
                sMap.put(sChar, tChar);
            }

        }
        return true;
    }

    public static void main(String[] args){
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphicUsingHashMap(s,t));
        s = "addf"; t  = "eggg";
       System.out.println(isIsomorphicUsingHashSet(s,t));
    }
}
