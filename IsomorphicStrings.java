// Time complexity: O(n)
//Space COmplexity : O(1) - since max we store is all ascii characters = O(256)
/*Approach: Create a Hashmap to store the chars as keys from string s. We need a Hashset to store the values, let's call it tSet
  for each char in s, see if it has an entry in sMap, if yes, it's value should be equal to char in string t.
  if no, we create an entry for it with key as schar and value as tchar. 
  we also add the tchar to the tSet. we then check if the new tchar is already there in the tSet, in that case we return false
  else we add it to the Map and set respectively 
*/

import java.util.HashMap;
import java.util.HashSet;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> sMap = new HashMap<>();
        HashSet<Character> tSet = new HashSet<>();
        if (s == null && t == null) return true; //null case
        if (s == null || t == null) return false;
        if (s.length() != t.length()) return false; // if they are not equal length

        for(int i = 0; i< s.length(); i++){
            char sChar = s.charAt(i); 
            char tChar = t.charAt(i);
            // check if sMap alreadt has that entry, if yes it must match the tChar
            if(sMap.containsKey(sChar)){
                if (sMap.get(sChar)!=tChar){ return false;}
            }else{
                if (tSet.contains(tChar)) {return false;} // if it is a new entry check if it already exists in tset
                else{ //if not, make an entry for it in smap and tset
                    sMap.put(sChar, tChar); 
                    tSet.add(tChar);
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));
        System.out.println(isIsomorphic("ggd", "ddg"));
        System.out.println(isIsomorphic("egl", "add"));
        System.out.println(isIsomorphic("ega", "add"));
    }
}