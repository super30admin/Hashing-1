import java.util.HashMap;
import java.util.Map;

// Time Complexity : O(n)
// Space Complexity : O(1) - because we are creating char to string map. The max combination can be only 26
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

//Create a map with letter as the key and the corresponding word as the value.
//Iterate through the array if letter is already present as a key in the map and the
//corresponding value does not match with the key then return false

class Problem3{
    public boolean wordPattern(String pattern, String s) {

        Map<Character,String> stringMap = new HashMap<Character,String>();
        char[] charArr = pattern.toCharArray();
        String[] stringArr = s.split(" ");
        if(charArr.length != stringArr.length) return false;
        for(int i = 0 ; i<charArr.length; i++){
            if(stringMap.containsKey(charArr[i])){
                if(!stringMap.get(charArr[i]).equals(stringArr[i])){
                    System.out.println(charArr[i]);
                    return false;
                }
            } else {
                if(stringMap.values().contains(stringArr[i])){
                    return false;
                }
                stringMap.put(charArr[i],stringArr[i]);
            }
        }
        return true;
    }
}