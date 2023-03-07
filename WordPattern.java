import java.util.HashMap;

public class WordPattern {
    /*
    Time Complexity : O(N)
    Space Complexity : O(N) - where N is size of words in String s
    Did this problem run on leetcode : yes
     */

    public boolean wordPattern(String pattern, String s) {
        String[] strArr = s.split(" ");
        HashMap<Character,String> pMap = new HashMap<>();
        HashMap<String,Character> sMap = new HashMap<>();
        for(int i =0; i<pattern.length(); i++) {
            if(!pMap.containsKey(pattern.charAt(i))) {
                pMap.put(pattern.charAt(i), strArr[i]);
            } else {
                if(!pMap.get(pattern.charAt(i)).equals(strArr[i])){
                    return false;
                }
            }
            if(!sMap.containsKey(strArr[i])) {
                sMap.put(strArr[i], pattern.charAt(i));
            } else {
                if(sMap.get(strArr[i]) != pattern.charAt(i)) return false;
            }
        }
        return true;
    }
}
