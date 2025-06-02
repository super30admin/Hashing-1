
//Time complexity = o(m*n)
//Space complexity = o(n)

import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        int sl = s.length();
        int tl = t.length();
        if(sl!= tl)
        {
            return false;
        }
        HashMap<Character, Character> smap = new HashMap<>();
        HashMap<Character, Character> tmap = new HashMap<>();
        for(int i = 0 ;i<sl;i++)
        {
            Character schar = s.charAt(i);
            Character tchar = t.charAt(i);
            if(smap.containsKey(schar))
            {
                if(smap.get(schar)!= tchar)
                {
                    return false;
                }
            }
            else{
                smap.put(schar,tchar);
            }
            if(tmap.containsKey(tchar))
            {
                if(tmap.get(tchar)!= schar)
                {
                    return false;
                }
            }
            else{
                tmap.put(tchar,schar);
            }
        }
        return true;
    }
}