
import java.util.*;

class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++)
        {
            int ascii1 = (int) s.charAt(i);
            int ascii2 = (int) t.charAt(i);

            if(!map.containsKey(ascii1))
            {
                map.put(ascii1, ascii2);
            }

            else
            {
                if(map.get(ascii1) != ascii2)
                {
                    return false;
                }
            }

        }

        return true;

    }
}