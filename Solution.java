//We use two hashmaps, one to store mapping from s-->t and other to store from t->s. In each hashmap we check if the char is already present . if present, we check if the mapping is to same element, if not we retun false

//Time complexity --> O(n)
//space complexity --> O(1) --> as limited mappings (26 lower case alphabets)


import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {

        if(s==null && t==null)return true;
        if(s==null || t== null)return false;
        if(s.length() != t.length()) return false;
        HashMap <Character, Character> sMap = new HashMap<>();
        HashMap <Character, Character> tMap = new HashMap<>();

        for(int i=0; i < s.length(); i++){

            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(sMap.containsKey(sChar)){

                if(sMap.get(sChar) != tChar) return false;
            }else {
                sMap.put(sChar,tChar);
            }

             if(tMap.containsKey(tChar)){

                if(tMap.get(tChar) != sChar) return false;
            }else {
                tMap.put(tChar,sChar);
            }
         }
      return true;
    }
}