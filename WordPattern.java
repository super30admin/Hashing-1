import java.util.*;

public class WordPattern {

        public static boolean wordPattern(String pattern, String s) {
            if (s == null || pattern == null) return false;
            if (pattern.length() != s.split(" ").length) return false;
            int cnt =0;
            Map<Character,String> map = new HashMap<>();
            Set<String> set = new HashSet<>();
            for (String str : s.split(" ")){
                if (map.containsKey(pattern.charAt(cnt))){
                    if (!map.get(pattern.charAt(cnt)).equals(str)) return false;
                } else {
                    if (set.contains(str)) return false;
                    map.put(pattern.charAt(cnt), str);
                    set.add(str);
                }
                cnt++;
            }
            return true;
        }

        public static void main(String[] args) {

            System.out.println(wordPattern("abba", "dog cat cat dog"));
            
        }
    
    
}
