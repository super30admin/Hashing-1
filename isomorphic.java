import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> hm=new HashMap<>();
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char schar=s.charAt(i);
            char tchar=t.charAt(i);

            if(!hm.containsKey(schar)){
                if(hs.contains(tchar)){
                    return false;
                }
                else{
                    hm.put(schar,tchar);
                    hs.add(tchar);
                }
            }
            if(hm.containsKey(schar)){
                if(hm.get(schar)!=tchar){
                    return false;
                }
            }

        }
        return true;
    }
}