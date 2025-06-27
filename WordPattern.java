//Time Complexity - O(n * k) k is length of pattern and n is number of words in s.
//Space Complexity - O(n)

// Implemented using a HashMap and HashSet to find the pattern with words.
// At each time new character is found its added to map with value as word and word is also addded to set
import java.util.HashMap;
import java.util.HashSet;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if( pattern.length() != words.length) {
            return false;
        }
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        for(int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String str = words[i];
            if(map.containsKey(c)){
                if(!map.get(c).equals(str)){
                    return false;

                }

            } else {
                map.put(c, str);
                if(set.contains(str)){
                    return false;
                }
                set.add(str);

            }
        }
        return true;

    }
}
