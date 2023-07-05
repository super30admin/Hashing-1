import java.util.HashMap;
import java.util.Map;

class isIsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if(s.isBlank()){
            return false;
        }else if(t.isBlank()){
            return false;
        }else if(s.length() != t.length()){
            return false;
        }
        
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Map<Character, Character> sMap = new HashMap<Character, Character>();
        Map<Character, Character> tMap = new HashMap<Character, Character>();

        
        for(int i=0; i < s.length(); i++){
            if(sMap.containsKey(sChars[i])){
                char sValue = sMap.get(sChars[i]);
                if(tMap.containsKey(sValue)){
                    char tValue = tMap.get(sValue);
                    if(tValue != sChars[i] || sValue != tChars[i]){
                        return false;
                    }
                }
            }else{
                if(tMap.containsKey(tChars[i])){
                    return false;
                }
                sMap.put(sChars[i], tChars[i]);
                tMap.put(tChars[i], sChars[i]);
            }

        }

        return true;
    }
}