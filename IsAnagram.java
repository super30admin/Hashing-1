import java.util.HashMap;
import java.util.Map;

public class IsAnagram {

    public static boolean isAnagram(String s, String t) {
        if(s.length() == t.length()){
            Map<Character,Integer> map =new HashMap<>();

            for(int i=0;i<s.length();i++){
                if(map.containsKey(s.charAt(i))){
                    map.put(s.charAt(i) , map.get(s.charAt(i))+1);
                }
                else{
                    map.put(s.charAt(i) , 1);
                } 
                if(map.containsKey(t.charAt(i))){
                    map.put(t.charAt(i) , map.get(t.charAt(i))-1);
                }
                else{
                    map.put(t.charAt(i) , -1);
                }  
            }
            System.out.println(map);
            for (Map.Entry<Character,Integer> entry : map.entrySet()){
                if(entry.getValue() != 0)
                    return false;
            }

            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("ste", "sde"));
    }
    
}