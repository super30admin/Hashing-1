// Time Complexity : O(n+m)
// Space Complexity : O(n+m) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    
     public boolean wordPattern(String pattern, String s) {
        
        String [] arrStr = s.split(" ");
        Map<Character,String> mapChar = new HashMap<>();
        Map<String,Character> mapWord = new HashMap<>();
        if(pattern.length() != arrStr.length)
            return false;
        for(int i=0; i<pattern.length();i++)
        {
            char sChar = pattern.charAt(i);
            String value = arrStr[i];
            if(!mapChar.containsKey(sChar))
            {
                if(mapWord.containsKey(value))
                {
                    return false;
                }
                else
                {
                mapChar.put(sChar,value);
                mapWord.put(value,sChar);

                }
            }
            else
            {
                String mappedWord = mapChar.get(sChar);
                if(!mappedWord.equals(value))
                    return false;
            }
            
        }
         return true;
    }
    

    public static void main(String[] args)
    {
        String pattern = "abba";
        String s  = "dog cat cat dog";
        WordPattern w = new WordPattern();
        System.out.println(w.wordPattern(pattern, s));;

    }
}

