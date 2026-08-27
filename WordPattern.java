//Time Complexity : O(n)
//Space Complexity : O(n)

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {

        String[] arr = s.split(" ");
        Map<String, Character> sMap = new HashMap<>();
        Set<Character> set = new HashSet<>();

        int p = pattern.length();
        int n = arr.length;
        if(p != n) return false;

        for(int i = 0; i < arr.length; i++) {
            if(sMap.containsKey(arr[i])) {
                if(!sMap.get(arr[i]).equals(pattern.charAt(i))) return false;
            } else {
                if(set.contains(pattern.charAt(i))) return false;
                sMap.put(arr[i], pattern.charAt(i));
                set.add(pattern.charAt(i));
            }
        }

        return true;
    }
}
