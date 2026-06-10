package Hashing-1;

public class Isomorphic {
    
}
//leetcode 205
class Solution {
    public boolean isIsomorphic(String s, String t) {

    int sl = s.length();
    int tl = t.length();
    HashMap<Character,Character> smap = new HashMap<>(); // s-> t mapping
    HashMap<Character,Character> tmap = new HashMap<>(); // t -> s mapping 
    for(int i = 0; i < sl; i++){
        char schar = s.charAt(i);
        char tchar = t.charAt(i);
        if(smap.containsKey(schar)){
            if(smap.get(schar)!=tchar)
                return false; // s-char conflict
            }
            else{
                smap.put(schar,tchar);
            }
        
        if(tmap.containsKey(tchar)){
            if(tmap.get(tchar)!=schar)
                return false;// t-char conflict
            }
            else{
                tmap.put(tchar,schar);
            }
    }return true;
    }
}
// Time compexity O(n)- where n is length of string
// Space compexity 0(1) - at most 128 (or 256) entries per map
