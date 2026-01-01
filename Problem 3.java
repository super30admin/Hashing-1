import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] str=s.split(" ");
        int pl=pattern.length();
        if(pl != str.length) return false;
        HashMap<Character,String> pmap =new HashMap<>();
        HashMap<String,Character> smap =new HashMap<>();
        //iterate over pattern characters and string s 
        for(int i=0;i<str.length;i++){
            String word=str[i];
            char pChar=pattern.charAt(i);
            if(pmap.containsKey(pChar)){
                //to check if earlier pattern character is mapped to s string
                //if not then we return false
                if(!pmap.get(pChar).equals(word)){
                    return false;
                }
            }
            //if no mapping is done previously, then map it
            else{
                pmap.put(pChar,word);
            }
            //s to pattern mapping
            if(smap.containsKey(word)){

                if(smap.get(word)!=pChar){
                    return false;
                }
            }
            else{
                smap.put(word,pChar);
            }
        }
        return true;
    }
}