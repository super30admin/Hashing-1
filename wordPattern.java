import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class wordPattern {
    class Solution {
        public boolean wordPattern(String pattern, String s) {
            String[] words=s.split(" ");
            if(pattern.length()!=words.length) return false;
            Map<Character,String> map= new HashMap<>();
            Set<String> seenWords= new HashSet<>();

            for(int i=0;i<pattern.length();i++)
            {
                String word=words[i];
                char c=pattern.charAt(i);
                if(!map.containsKey(c))
                {
                    if (seenWords.contains(word)) return false;
                    map.put(c,word);
                    seenWords.add(word);
                }
                else{
                    if(!map.get(c).equals(word)) return false;
                }
            }
            return true;
        }
    }
}
