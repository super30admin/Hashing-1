//SC:O(256) ≈ O(1)
class Solution {
    public boolean isIsomorphic(String s, String t) {
        int slen= s.length();
        int tlen= t.length();
        
        if(slen!=tlen) return false;
        HashMap<Character, Character> smap = new HashMap<>();
        HashMap<Character, Character> tmap = new HashMap<>();

        for(int i=0; i<slen;i++){
            if(!smap.containsKey(s.charAt(i))){
                smap.put(s.charAt(i),t.charAt(i));
            }else{
                if(!smap.get(s.charAt(i)).equals(t.charAt(i)))
                    return false;
            }
            
            if(!tmap.containsKey(t.charAt(i))){
                tmap.put(t.charAt(i),s.charAt(i));
            }else{
                if(!tmap.get(t.charAt(i)).equals(s.charAt(i)))
                    return false;
            }
        }
        
        return true;
    }
}
