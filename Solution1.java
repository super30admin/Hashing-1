//Isomorphic Strings
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution1 {
    public boolean isIsomorphic(String s, String t) {

        //We can use hashmap to store the first string characters as keys and second string characters as its mapped values
        //We can use hashset to store their values so that they can be used later on to detect breach(not isomorphic)

        Map<Character,Character> smap=new HashMap<>();
        Set<Character> set=new HashSet<>();
        char schar,tchar;
        //chk for null
        if(s==null && t==null)
            return true;
        if(s==null && t!=null)
            return false;
        if(s!=null && t==null)
            return false;
        if(s.length()!=t.length())
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            schar=s.charAt(i);
            tchar=t.charAt(i);
            if(smap.containsKey(schar))
            {
                if(smap.get(schar)!=tchar) return false;
            }
            else
            {
                if(set.contains(tchar))
                {
                    return false;
                }
                else
                {
                    smap.put(schar,tchar);
                    set.add(tchar);
                }
            }
        }
        return true;
    }
}