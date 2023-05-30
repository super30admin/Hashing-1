import java.util.*;
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String [] word = s.split("\\s");
        HashMap <Character, String> map = new HashMap<>();
        
        if (word.length != pattern.length())
        {
            return false;
        }
        for (int i = 0;i< word.length; i++)
        {
            if (!map.containsKey(pattern.charAt(i)))
            {
                if (map.containsValue(word[i]))
                {
                    return false;
                }
                map.put(pattern.charAt(i), word[i]);
            }
            else
            {
                String value = map.get(pattern.charAt(i)).toString();
                if ( !value.equals(word[i]))
                {
                    return false;
                }
            }
        }
        return true;
        
    }
}