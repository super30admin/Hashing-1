class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length()!=t.length()) return false;
        
        Map<Character,Character> sMap = new HashMap<>();
        Map<Character,Character> tMap = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            if(!sMap.containsKey(s.charAt(i))){
                sMap.put(s.charAt(i),t.charAt(i));
            }else{
                char sv = sMap.get(s.charAt(i));
                    if(sv!=t.charAt(i))
                        return false;
            }
            
            if(!tMap.containsKey(t.charAt(i))){
                tMap.put(t.charAt(i),s.charAt(i));
            }else{
                char tv = tMap.get(t.charAt(i));
                    if(tv!=s.charAt(i))
                        return false;
            }
        }
        
        return true;
        
    }
    // TC : O(l)
    // SC : O(1)
}