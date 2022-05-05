/**
iterate over the length of string and check if there exists one to one mappings
of characters from one string to another
**/
class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        int length = s.length();
        Map<Character, Character> smap = new HashMap<>();
        Map<Character, Character> tmap = new HashMap<>();
        
        
        for(int i = 0 ;i < length; i ++)
        {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            /**
                Check if sChar already exists in in sMap
                if yes then its should be equal to current tChar else return false
                
                AND
                
                Check if tChar already exists in in tMap
                if yes then its should be equal to current sChar else return false
                
            **/
            
            boolean sCharExists = smap.containsKey(sChar);
            
            if(sCharExists)
            {
                if(smap.get(sChar) != tChar)
                {
                    return false;
                }
            }
            else
            {
                smap.put(sChar, tChar);
            }
            
            boolean tCharExists = tmap.containsKey(tChar);
            
            if(tCharExists)
            {
                if(tmap.get(tChar) != sChar)
                {
                    return false;
                }
            }
            else
            {
                tmap.put(tChar, sChar);
            }
            
        }
        
        return true;
    }
}