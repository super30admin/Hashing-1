import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public boolean wordPattern(String pattern, String s)
    {
        Map<Character, String> patternMap = new HashMap<>();
        Map<String, Character> sMap = new HashMap<>();
        String[] words = s.split(" ");
        int n = pattern.length();
        if (n!=words.length)
        {
            return false;
        }
        for (int i=0; i<n; i++)
        {
            if (!patternMap.containsKey(pattern.charAt(i)))
                patternMap.put(pattern.charAt(i), words[i]);
            else{
                if (patternMap.get(pattern.charAt(i)).equals(words[i])==false)
                    return false;
            }
            if (!sMap.containsKey(words[i]))
                sMap.put(words[i], pattern.charAt(i));
            else{
                if (sMap.get(words[i]).equals(pattern.charAt(i))==false)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        WordPattern wordPattern=new WordPattern();
        System.out.println(wordPattern.wordPattern("abba","dog cat cat dog"));
    }
}
