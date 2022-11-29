import java.util.HashMap;
import java.util.Map;

//Time Complexity :O(N) where N is the size of given String 
//Space Complexity :O(N) constant space because of  map size can only be of size of character set 
//Did this code successfully run on Leetcode :Yes
//Any problem you faced while coding this : No 


public class WordPattern {
public boolean wordPattern(String pattern, String s) {
        
        char[] c1 = pattern.toCharArray();
        String[] s2 = s.split(" ");
        if(c1.length!=s2.length)
            return false;
        int i=0;
        int n = c1.length;
        Map<Character,String> map1 = new HashMap<>();
        Map<String,Character> map2 = new HashMap<>();
        
        while(i<n){

            char k  = c1[i];
            String v  = s2[i];

        if(map1.containsKey(k)){
           String temp =  map1.get(k);
           if(!v.equals(temp))
            return false;
        }else{
            map1.put(k,v);
        }
         if(map2.containsKey(v)){
           char temp =  map2.get(v);
           if(k!=temp)
            return false;
        }else{
            map2.put(v,k);
        }

    i++;
    }
    return true;
    }

}
