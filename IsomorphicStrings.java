import java.util.HashMap;
import java.util.HashSet;

public class IsomorphicStrings {

    /*
    Time Complexity : O(N) where N is length of string
    Space Complexity : O(1) - Because given any size of string, and no of ASCII values, which is 256, the size of Hashmaps doesn't increase
    more than 256, which is constant space
    Did this problem run on leetcode : yes
     */

    public boolean isIsomorphic(String s, String t) {
        // Solution1 using two hashmaps
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!sMap.containsKey(s.charAt(i))) {
                sMap.put(s.charAt(i), t.charAt(i));
            } else {
                if(sMap.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            }
            if(!tMap.containsKey(t.charAt(i))) {
                tMap.put(t.charAt(i), s.charAt(i));
            } else {
                if(tMap.get(t.charAt(i)) != s.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }

    //Solution2 using hashset and hashmap
    public boolean isIsomorphic1(String s, String t) {
        HashMap<Character, Character> sMap = new HashMap<>();
        HashSet<Character> tSet = new HashSet<>();
        for(int i=0; i<s.length();i++) {
            if(!sMap.containsKey(s.charAt(i))) {
                if(!tSet.contains(t.charAt(i))) {
                    sMap.put(s.charAt(i), t.charAt(i));
                    tSet.add(t.charAt(i));
                } else return false;
            } else {
                if(sMap.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }
}
