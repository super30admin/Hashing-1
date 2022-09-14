//approach2 - Two Hashmap
//Time - O(n) - look up time for strings
//Space - O(1) - character at most are 100 so, even taking 2 hashmap will just make it constant only. 

import java.util.HashMap;
class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s == null || t == null) return true;
        if(s.length() != t.length()) return false;
        
        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++)
        {
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
           
            //check if values exist
            if(sMap.containsKey(schar))
            {
               //check if tmap also has the same mapping, keep going
               if(tchar != sMap.get(schar))return false;
            }
            else if(!tMap.containsKey(tchar))
            {
               //put values into Hashmaps
               sMap.put(schar, tchar);
               tMap.put(tchar, schar);
             }
             else
             {
                 return false;
             }      
        }
        
        return true;
    }
}