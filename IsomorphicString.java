import java.util.HashMap;
import java.util.List;

public class IsomorphicString {

    public boolean isIsomorphic(String s, String t) {

        // base case
        int sl = s.length();
        int tl = t.length();

        if(sl != tl) return false;

        // create hashmap for S
        HashMap<Character,Character> hashS = new HashMap<>(26);

        //
        for(int i = 0; i < sl; i ++){

            char Ssi = s.charAt(i);
            char Sti = t.charAt(i);
            // if in hashmap, check matching
            if(hashS.get(Ssi) != null)  {

                if(hashS.get(Ssi) != Sti)
                    return false;
            }
            // add to hashmap if not in already
            else hashS.put(Ssi, Sti);
        }

        // create hashmap for T and repeat

        HashMap<Character,Character> hashT = new HashMap<>(26);

        //
        for(int i = 0; i < tl; i ++){

            char Tti = t.charAt(i);
            char Tsi = s.charAt(i);
            // if in hashmap, check matching
            if(hashT.get(Tti) != null)  {

                if(hashT.get(Tti) != Tsi)
                    return false;
            }
            // add to hashmap if not in already
            else hashT.put(Tti, Tsi);

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
