import java.util.HashMap;
import java.util.Map;

public class IsIsoMorphic {
    public static boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                if(map.containsValue(t.charAt(i)))
                    return false;
                map.put(s.charAt(i) , t.charAt(i));
            }
            else if(map.get(s.charAt(i)) != t.charAt(i)){
                return false;
            }     
            // System.out.println(map);
        }
   
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isIsomorphic("bb", "ba"));
    }
    
}