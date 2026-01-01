import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {

        int sl=s.length();
        int tl=t.length();

        if(sl != tl) return false;

        HashMap <Character,Character> smap= new HashMap<>();
        HashMap <Character,Character> tmap= new HashMap<>();

        //iterate over s and t characters
        for(int i=0;i<sl;i++){
            char sChar= s.charAt(i);
            char tChar= t.charAt(i);
            //s to t mapping
            if(smap.containsKey(sChar)){
                //to check if earlier s character is mapped to t character
                //if not then we return false
                if(smap.get(sChar) != tChar){
                    return false;
                }
            }
            //if no mapping is done previously, then map it
            else{
                smap.put(sChar,tChar);
            }
        //t to s mapping
        if(tmap.containsKey(tChar)){
                //to check if earlier t character is mapped to s character
                //if not then we return false
                if(tmap.get(tChar)!=sChar){
                    return false;
                }
            }
            //if no mapping is done previously, then map it
            else{
                tmap.put(tChar,sChar);
            }
        }
        //if we dont get breach in above conditions then return true (i.e) Strings are isomorphic
     return true;
    }
}