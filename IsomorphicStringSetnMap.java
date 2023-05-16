import java.util.HashMap;
import java.util.HashSet;

public class IsomorphicStringSetnMap {

    public boolean isIsomorphic(String s, String t) {

        // base case
        int sl = s.length();
        int tl = t.length();

        if(sl != tl) return false;

        HashMap <Character, Character> sMap = new HashMap<>(26);
        HashSet <Character> tSet = new HashSet<>(26);

        for(int i =0; i < sl; i++){

            char si = s.charAt(i);
            char ti = t.charAt(i);

            if(!sMap.containsKey(si)){

                if(!tSet.contains(ti)){
                    sMap.put(si,ti);
                    tSet.add(ti);
                }
                else
                    return false;
            }

            else{
                if(sMap.get(si) != ti)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args){

        IsomorphicString object = new IsomorphicString();
        String sOne = "egg";
        String sTwo = "add";

        boolean result = object.isIsomorphic(sOne, sTwo);

        System.out.println("Isomorphic ness of strings is " + result);

    }
}
