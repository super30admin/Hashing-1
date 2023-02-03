//SC: O(256) i.e constant
//TC: O(n)

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Character> smap = new HashMap<>();
        HashMap<Character, Character> tmap = new HashMap<>();

        for(int i = 0; i<s.length(); i++){
            //get characters
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(smap.containsKey(sChar)){
                if(smap.get(sChar) != tChar) return false;
            }else{
                smap.put(sChar, tChar);
            }

            if(tmap.containsKey(tChar)){
                if(tmap.get(tChar) != sChar) return false;
            }else{
                tmap.put(tChar, sChar);
            }
        }
        return true;
        
    }
}
