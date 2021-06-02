import java.util.*;

class Solution02 {
    public boolean isIsomorphic(String s, String t) {
      Map<Character,Character> s_t = new HashMap();
      Map<Character,Character> t_s = new HashMap();
        for(int i=0;i<s.length();i++){
            char st = s.charAt(i);
            char ts=t.charAt(i);
            if(!s_t.containsKey(st)){
                s_t.put(st,ts);
            }
            else {if(s_t.get(st) != ts) return false;}
            if(!t_s.containsKey(ts)){
                t_s.put(ts,st);
            }
            else {if(t_s.get(ts) != st) return false;}
        }
        return true;
    }
}