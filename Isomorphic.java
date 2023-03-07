// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
 * Created two hash maps and stored the values and keys accordingly.
   If the key isn't stored, add it to the map.  
   If it exists, add the new value to the map
 */
class isIsomorphic {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> smap = new HashMap<>();
        HashMap<Character, Character> tmap = new HashMap<>();
        if(s== null && t==null) return true;
        if(s==null || t== null) return false;
        if(s.length() != t.length()) return false;
        for(int i=0; i < s.length();i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(!smap.containsKey(sChar)){
                smap.put(sChar,tChar);
            }
            else {if(smap.get(sChar) != tChar)
            return false; 
            }
            if(!tmap.containsKey(tChar))
                tmap.put(tChar,sChar);
                else if(tmap.get(tChar) != sChar)
                return false;  
        }
        return true;
    }
}
 