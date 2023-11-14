//Time Complexity:O(n)
//Space Complexity: O(1)

import java.util.HashMap;
import java.util.HashSet;

public class WordPattern {
     public boolean wordPattern(String pattern, String s) {
         if(s==null||pattern==null) return false;
         String[] stringList = s.split(" ");
        if(pattern.length() != stringList.length) return false;

        HashMap<Character,String> patternMap = new HashMap<>();
        HashSet<String> sSet = new HashSet<>();

        for(int i = 0;i<pattern.length();i++){
            String sString = stringList[i];
            char patternChar = pattern.charAt(i);

            if(patternMap.containsKey(patternChar))
               { if(!patternMap.get(patternChar).equals( sString)) return false;}
            else
            {
                if(sSet.contains(sString)) return false;
                sSet.add(sString);
                patternMap.put(patternChar,sString);
            }
            
        }
        return true;
    }
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        WordPattern wp = new WordPattern();

        System.out.println(wp.wordPattern(pattern,s));
    }
}
