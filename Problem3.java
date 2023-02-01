import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/*
approach: same as lecture with one hashmap and hashset
time: O(n)
space: O(1)
 */
public class Problem3 {
    static boolean wordPattern(String pattern, String s) {

        Map<Character, String> map = new HashMap<>();
        Set<String> tokens = new HashSet<>();
        String[] splitString = s.split(" ");
        if(pattern.length()!=splitString.length) return false;
        int j=0;
        for(int i=0;i<pattern.length();i++){
            char pChar = pattern.charAt(i);
            String token = splitString[j];
            if(!map.containsKey(pChar)){
                if(tokens.contains(token)){
                    return false;
                }
                else {
                    map.put(pChar, token);
                    tokens.add(token);
                }
            }
            else {
                if(!map.get(pChar).equals(token)) return false;
            }

            j++;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("given string follows given pattern "+(wordPattern("abba", "cat dog dog cat")));
    }
}
