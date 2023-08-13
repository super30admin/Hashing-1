// The basic idea of this solution is to have two hashmaps. One hashmap is for
// the first string s, and the second hashmap is for the second string t. Then,
// we iterate through the first string and add it to the first hashmap where the 
// key is one character and the value is the corresponding character in the other string.
// If the key already exists and the values are different, return false. Do the same
// For the other string.

//Time: O(n) + O(m) where n is length of s and m is length of t
//Space: O(n+m)
import java.util.HashMap;
public class Problem2 {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> sMap = new HashMap<>();
        HashMap<Character,Character> tMap = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            Character cs = s.charAt(i);
            Character ts = t.charAt(i);
            if(!sMap.containsKey(cs)){
                sMap.put(cs,ts);
            }
            if(sMap.get(cs)!=ts){
                return false;
            }       
        }
        for(int i = 0;i<t.length();i++){
            Character cs = s.charAt(i);
            Character ts = t.charAt(i);
            if(!tMap.containsKey(ts)){
                tMap.put(ts,cs);
            }
            if(tMap.get(ts)!=cs){
                return false;
            }
        }
        return true;
    }
}
