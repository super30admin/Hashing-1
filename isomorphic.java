import java.util.HashMap;
// Time Complexity : O(n)
//In this code we have used two maps and stored the characters and their indexes and if in a situation when both the map doest contains the key  with respective index value we have returned false
public class isomorphic {
    public static  boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;

        HashMap<Character,Integer > map1 = new HashMap<>();
        HashMap<Character,Integer > map2 = new HashMap<>();

        for(int i =0;i<s.length();i++){
            Character s1= s.charAt(i);
            Character t1 =t.charAt(i);

            if(!map1.getOrDefault(s1,-1).equals(map2.getOrDefault(t1,-1))){
                return false;
            }

            map1.put(s1,i);
            map2.put(t1,i);


        }
        return true ;
    }
    public static void main (String[] args) {
        String s ="paper";
        String t = "title";
        System.out.println(isIsomorphic(s,t));

    }
}
