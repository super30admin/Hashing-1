// Time Complexity : O(log N)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.HashMap;

public class Isomorphic {

    //using two hashmap: adding to map if doesnot exist or checking if the mapping is correct...
    public static boolean hashMapIsomorphic(String s, String t) {
        if (s == null && t== null) return true;
        if (s == null || t== null) return false;

        HashMap<Character,Character> smap = new HashMap<>();
        HashMap<Character,Character> tmap = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            //sMap
            if(smap.containsKey(sChar)){
                if(smap.get(sChar)!=tChar){ // o->a and later o->r => a!=r
                    return false;
                }     
            }
            else{
                smap.put(sChar,tChar);
                }
            // tMap
            if(tmap.containsKey(tChar)){
                if(tmap.get(tChar)!=sChar){
                    
                    return false;
                }
            }
            else{
                tmap.put(tChar,sChar);
                }            
        }
        return true;
        
    }
    public static void main(String[] args) {
        String s ="foo";
        String t ="bar";
        System.out.println(hashMapIsomorphic(s,t));
    }
}