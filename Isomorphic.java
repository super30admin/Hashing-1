import java.util.HashMap;

class Isomorphic {
       //Time Complexity: O(n)
    //Space Complexity: O(n)
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();

         //Loop to check Unique Char to String Mapping and  Unique String to Char Mapping
        for(int i=0;i<s.length();i++)
        {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar) != tChar) return false;
            } else{
                sMap.put(sChar,tChar);
            }

            if(tMap.containsKey(tChar)){
                if(tMap.get(tChar) != sChar) return false;
            } else{
                tMap.put(tChar,sChar);
            }
        }
        return true;
        
    }
}
