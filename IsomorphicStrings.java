import java.util.*;
import java.util.HashSet;

public class IsomorphicStrings {
    //https://leetcode.com/problems/isomorphic-strings/
    //Time Complexity - O(n)
    //Space Complexity - O(1)
    /* For finding the anagrams Hashset and hashmap method is used. Store the characters as key value pain of each string in hashmap and
    store the characters of second string in hashset. If the key and value are different in hashmap are different than return false.
    *
    * */

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s, t));
    }

    //2 hashmap method
    //Time Complexity - O(n)
    //Space Complexity - O(n) - can be considered as O(1)
    /*
    public static boolean isIsomorphic(String s, String t) {
        if(s.length()!= t.length()) return false;
        HashMap<Character,Character> sMap = new HashMap<Character,Character>();
        HashMap<Character,Character> tMap = new HashMap<Character,Character>();
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar)!=tChar) return false;
            }
            else sMap.put(sChar,tChar);
            if(tMap.containsKey(tChar)){
                if(tMap.get(tChar)!=sChar) return false;
            }
            else tMap.put(tChar,sChar);
        }
        return true;
    }
*/
    //Time Complexity - O(n)
    //Space Complexity - O(1)
    // HashMap and HashSet
    public static boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Character> sMap = new HashMap<Character, Character>();
        HashSet<Character> tSet = new HashSet<Character>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            //System.out.println(sChar+""+tChar);
            System.out.println(tSet);
            if(sMap.containsKey(sChar)){
               if(sMap.get(sChar)!=tChar)return false;
            }
            else{
                if(tSet.contains(tChar)) return false;
                sMap.put(sChar,tChar);
                tSet.add(tChar);

            }
        }
        return true;
    }
    //2 char arrays
    //Time Complexity - O(n)
    //Space Complexity - O(1)
    /*
    public static boolean isIsomorphic(String s, String t){
        if(s.length()!=t.length()) return false;
        char[] sArray = new char[100];
        char[] tArray = new char[100];
        for (int i = 0; i < t.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(sArray[sChar-' ']!=0){
                if(sArray[sChar-' ']!=tChar) return false;
            }
            else sArray[sChar-' ']=tChar;
            if(tArray[tChar-' ']!=0){
                if(tArray[tChar-' ']!=sChar) return false;
            }
            else tArray[tChar-' ']=sChar;
        }
        return true;
    }

*/
}

