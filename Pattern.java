
//Time complexity = O(n)
//Space Complexity = O(n)

import java.util.HashMap;
import java.util.HashSet;

class Pattern {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        String [] str = s.split(" ");
        if(pattern.length() != str.length)
        {
            return false;
        }
        else{
            for(int i=0;i< pattern.length();i++)
            {
                char ch = pattern.charAt(i);
                if(map.containsKey(ch))
                {
                    if(!(map.get(ch).equals(str[i]))) return false;
                }
                else
                {
                    if(set.contains(str[i]))
                    {
                        return false;
                    }
                    else{
                        map.put(ch,str[i]);
                        set.add(str[i]);
                    }
                }
            }
        }
        return true;
    }
}