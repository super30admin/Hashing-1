package prog_205_isomorphicString;

import java.util.HashMap;

public  class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false ;
//In this solution we are maintaining 2 hashmap for source to target mapping and target to source mapping.
//We will be checking if each character is mapped to same character from both the strings
        HashMap<Character, Character> source = new HashMap<>();
        HashMap<Character, Character> target = new HashMap<>();
        for(int i=0; i<=s.length()-1; i++){
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);

            if(!(source.containsKey(s1)) && !(target.containsKey(t1))){
                source.put(s1, t1);
                target.put(t1,s1);

            }

            if(source.get(s1) !=null && source.get(s1) != t1) {
                return false ;
            }
            if (target.get(t1)!=null && target.get(t1)!= s1){
                return false ;
            }


        }
        return true ;
    }
}
