//Time Complexity : O(n)
//Space Complexity : O(MAX_CHAR)

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Integer> m1 = new HashMap<>();
        Map<Character,Integer> m2 = new HashMap<>();

        if(s.length() != s.length()){
            return false;
        }

        for(int i=0; i<s.length(); i++){
            if(!m1.containsKey(s.charAt(i))){
                m1.put(s.charAt(i),i);
            }
            if(!m2.containsKey(t.charAt(i))){
                m2.put(t.charAt(i),i);
            }

            if(m1.get(s.charAt(i)) != m2.get(t.charAt(i))){
                return false;
            }
        }

        return true;
    }

    public static void main(){
        Solution sol = new Solution();
        String s = "egg";
        String t = "add";

        Boolean checkIsomorphic = sol.isIsomorphic(s,t);
        system.out.print("Check : "+checkIsomorphic);

        s = "egg";
        t = "bar";

        checkIsomorphic = sol.isIsomorphic(s,t);
        system.out.print("Check : "+checkIsomorphic);
    }
}