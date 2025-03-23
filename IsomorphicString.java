import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t)
    {
       HashMap<Character,Character> mapS = new HashMap<>();
       HashMap<Character,Character> mapT = new HashMap<>();

        int s1=0;
        int t1=0;

        while(s1 < s.length() && t1 < t.length())
        {
            if(mapS.containsKey(s.charAt(s1)) && mapS.get(s.charAt(s1)) != t.charAt(t1) || 
               mapT.containsKey(t.charAt(t1)) && mapT.get(t.charAt(t1)) != s.charAt(s1) )
               {
                return false;
               }


            mapS.put(s.charAt(s1),t.charAt(t1));
            mapT.put(t.charAt(t1),s.charAt(s1));
            s1++;
            t1++;

        }
    return true;
    }
}
