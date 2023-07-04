import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

// Word pattern match eg: pattern = "abba" , s= "dog cat cat dog"
//Time complextity: O(n)
//Space Complexity: O(1)
class Solution {
    public boolean wordPattern(String pattern, String s) {

        if(pattern == null || s == null) return false;
        String[] sArray = s.split(" ");
        if(sArray.length != pattern.length()) return false;

        HashMap<Character,String> map = new HashMap<Character, String>();
        HashSet<String> set = new HashSet<String>();

        for(int i =0; i<pattern.length(); i++) {
            if(!map.containsKey(pattern.charAt(i))) {
                if(set.contains(sArray[i])) return false;
                else {
                    map.put(pattern.charAt(i), sArray[i]);
                }
                set.add(sArray[i]);
            }
            else{
                if(!Objects.equals(sArray[i], map.get(pattern.charAt(i)))) return false;

            }
        }
        return true;
        
    }
}