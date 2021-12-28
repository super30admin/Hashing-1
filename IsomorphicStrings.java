//time o(n) where n is the length of the string
//space o(1) both the maps will have fixed size
class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> sMap = new HashMap();
        Map<Character,Character> tMap = new HashMap();
        
        for(int i=0;i<s.length();i++){
            Character sChar = s.charAt(i);
            Character tChar = t.charAt(i);
            
            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar)!=tChar){
                    return false;
                }
            }else{
                sMap.put(sChar,tChar);
            }
            
            
            if(tMap.containsKey(tChar)){
                if(tMap.get(tChar)!=sChar){
                    return false;
                }
            }else{
                tMap.put(tChar, sChar);
            }
            
        }
        
           return true;
    }
}